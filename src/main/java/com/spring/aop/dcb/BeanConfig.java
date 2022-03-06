package com.spring.aop.dcb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.spring.aop.dcb")
@EnableAspectJAutoProxy
public class BeanConfig {

//    @Bean
//    public ShoppingCart cart() {
//        return new ShoppingCart();
//    }

}
