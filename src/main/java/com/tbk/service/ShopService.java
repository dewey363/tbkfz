package com.tbk.service;

import com.tbk.base.service.BaseService;
import com.tbk.entity.Shop;
import com.tbk.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ShopService extends BaseService<Shop,String> {

    @Autowired
    protected void setShopRepository(ShopRepository shopRepository) {
        setBaseRepository(shopRepository);
    }

    protected ShopRepository getShopRepository() {
        return (ShopRepository)this.baseRepository;
    }

    public Page<Shop> findTopN(int i) {
        Pageable pageable=new PageRequest(0,i);
        return this.findPage(pageable);
    }

    public Page<Shop> findPage(Pageable pageable) {
        return getShopRepository().findPage(pageable);
    }
}
