package com.spring.aop.dr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        AoPClass aoPClass = context.getBean(AoPClass.class);

        aoPClass.hello();

        aoPClass.printSomething("Md. Tanver Ahammed");

        aoPClass.sum(10, 20);

    }
}
