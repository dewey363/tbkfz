package com.tbk.service;

import com.tbk.base.service.BaseService;
import com.tbk.entity.Product;
import com.tbk.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;


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


    public Page<Product> findPage(Pageable pageable) {
        return getProdcutRepository().findPage(pageable);
    }
}
