package com.tbk.service;

import com.tbk.base.service.BaseService;
import com.tbk.entity.Product;
import com.tbk.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
@Transactional
public class ProductService extends BaseService<Product,String> {

    @Autowired
    protected void setProdcutRepository(ProductRepository productRepository) {
        setBaseRepository(productRepository);
    }

    protected ProductRepository getProdcutRepository() {
        return (ProductRepository)this.baseRepository;
    }



}
