package com.spring.core.p5.life.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c5/lc/xml/lc.config.xml");

        Samosa samosa1 = context.getBean("samosa1", Samosa.class);
        context.registerShutdownHook();
        System.out.println(samosa1);

        System.out.println("-----------------------------------------------");
        Pepsi pepsi1 = context.getBean("pepsi1", Pepsi.class);
        System.out.println(pepsi1);

        System.out.println("-----------------------------------------------");
        Example example = context.getBean("example", Example.class);
        System.out.println(example);

        context.close();

    }
}
