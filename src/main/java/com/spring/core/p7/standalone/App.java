package com.spring.core.p7.standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c7/standalone/standalone.config.xml");

        Person person = context.getBean("person", Person.class);

        System.out.println(person);

        context.close();

    }
}
