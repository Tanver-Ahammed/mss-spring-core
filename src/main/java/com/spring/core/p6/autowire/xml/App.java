package com.spring.core.p6.autowire.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c6/autowire/xml/autowire.config.xml");

        Employee employee = context.getBean("employee1", Employee.class);

        System.out.println(employee);

        context.close();

    }
}
