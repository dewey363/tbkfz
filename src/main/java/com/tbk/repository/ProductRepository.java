package com.tbk.repository;


import com.tbk.base.repository.BaseRepository;
import com.tbk.entity.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductRepository extends BaseRepository<Product,String> {

}
