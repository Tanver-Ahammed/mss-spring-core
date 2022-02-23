package com.spring.core.p6.autowire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c6/autowire/annotation/autowire.config.xml");

        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee);

        context.close();

    }
}
