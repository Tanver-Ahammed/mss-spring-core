package com.spring.core.p3.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("c3/reference/reference.config.xml");

        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);

        System.out.println(student1);
        System.out.println(student2);

        context.close();

    }
}
