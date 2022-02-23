package com.spring.core.p1.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("c1/basic/config.xml");

        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);
        Student student3 = context.getBean("student3", Student.class);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
