package com.spring.aop.dr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.spring.aop.dr")
@EnableAspectJAutoProxy
public class BeanConfig {

//    @Bean
//    public ShoppingCart cart() {
//        return new ShoppingCart();
//    }

}
