package com.spring.orm.annotation.dao;

import com.spring.orm.annotation.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
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
    public int insertProduct(Product product) {
        int affectedRow = (Integer) this.getHibernateTemplate().save(product);
        return affectedRow;
    }

}
