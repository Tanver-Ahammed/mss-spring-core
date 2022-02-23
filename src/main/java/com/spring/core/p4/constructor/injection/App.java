package com.spring.core.p4.constructor.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c4/ci/ci.config.xml");

        Person person1 = context.getBean("person1", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        Person person3 = context.getBean("person3", Person.class);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        // addition
        Addition addition = context.getBean(Addition.class);
        System.out.println(addition);
        addition.doSum();

        context.close();

    }
}
