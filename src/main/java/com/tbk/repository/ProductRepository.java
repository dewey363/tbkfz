package com.tbk.repository;


import com.tbk.base.repository.BaseRepository;
import com.tbk.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductRepository extends BaseRepository<Product,String> {

    @Query(value = "select t from Product t where t.deleted = 0")
    Page<Product> findPage(Pageable pageable);
}
