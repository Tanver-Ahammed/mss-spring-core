package com.spring.core.p9.spEL;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c9/spEL/spEL.config.xml");

        Demo demo1 = context.getBean("demo", Demo.class);

        System.out.println(demo1);

        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("215+541");
        System.out.println(expression.getValue());

        context.close();

    }
}
