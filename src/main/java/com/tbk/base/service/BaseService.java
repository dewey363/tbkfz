package com.tbk.base.service;

import com.tbk.base.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by TU on 2018/8/24.
 */
@Service
@Transactional
public class BaseService <T,ID extends Serializable> {


    protected BaseRepository baseRepository;

    protected void setBaseRepository(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }

    public T findById(String id) {
        T entity = (T) baseRepository.findOne(id);
        return entity;
    }

    public T save(T entity){//根据实体保存记录
        T result = (T) baseRepository.save(entity);
        return result;
    }

    public void delete(T entity){//根据实体删除记录
        baseRepository.delete(entity);
    }

    public void delete(String id){//根据id删除记录
        baseRepository.delete(id);
    }

    public List<T> findALL(Sort sort){
        List<T> entities = baseRepository.findAll(sort);
        return entities;
    }

    public List<T> findAll(){
        List<T> entities = baseRepository.findAll();
        return entities;
    }

}
