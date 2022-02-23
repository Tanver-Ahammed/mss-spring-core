package com.spring.core.p8.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c8/stereotype/stereotype.config.xml");

        Student student1 = context.getBean("student", Student.class);
        Student student2 = context.getBean("student", Student.class);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        context.close();

    }
}
