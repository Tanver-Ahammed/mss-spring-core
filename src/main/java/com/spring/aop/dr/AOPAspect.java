package com.spring.aop.dr;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPAspect {

    @Before("execution(* AoPClass+.*(..))")
    public void beforeMethod() {
        System.out.println("Starting..............");
    }

    @After("execution(* AoPClass+.*(..))")
    public void afterMethod() {
        System.err.println("ending..............");
    }

}
