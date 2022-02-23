package com.spring.orm.xml.dao;

import com.spring.orm.xml.entities.Product;
//import org.springframework.transaction.annotation.Transactional;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductDao {

    @Transactional
    int insertProduct(Product product);

    @Transactional
    Product getSingleProduct(int productId);

    @Transactional
    List<Product> getAllProduct();

    @Transactional
    void deleteProduct(int productId);

    @Transactional
    void updateProduct(Product product);

}
