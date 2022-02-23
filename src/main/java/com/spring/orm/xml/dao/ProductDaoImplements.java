package com.spring.orm.xml.dao;

import com.spring.orm.xml.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;


@Component
public class ProductDaoImplements implements ProductDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    @Transactional
    public int insertProduct(Product product) {
        int affectedRow = (Integer) this.getHibernateTemplate().save(product);
        return affectedRow;
    }

    @Override
    public Product getSingleProduct(int productId) {
        Product product;
        product = this.getHibernateTemplate().get(Product.class, productId);
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> products = this.getHibernateTemplate().loadAll(Product.class);
        return products;
    }

    @Override
    public void deleteProduct(int productId) {
        Product product = this.getHibernateTemplate().get(Product.class, productId);
        this.getHibernateTemplate().delete(product);
        System.out.println(productId + " is deleted successfully........");
    }

    @Override
    public void updateProduct(Product product) {
        this.getHibernateTemplate().update(product);
        System.out.println(product.getProductId() + " is Updated successfully.....");
    }

}
