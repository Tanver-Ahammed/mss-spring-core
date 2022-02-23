package com.spring.orm.annotation;

import com.spring.orm.annotation.config.ProductBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context  =
                new AnnotationConfigApplicationContext(ProductBeanConfig.class);

        LocalSessionFactoryBean dao = context.getBean(LocalSessionFactoryBean.class);

        System.out.println(dao);


    }
}
