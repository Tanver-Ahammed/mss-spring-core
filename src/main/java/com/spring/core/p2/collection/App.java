package com.spring.core.p2.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("c2/collection/collection.config.xml");

        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee);

        System.out.println(employee.getPhones().getClass());

        context.close();

    }
}
