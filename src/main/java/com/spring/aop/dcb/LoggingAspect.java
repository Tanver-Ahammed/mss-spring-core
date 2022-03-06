package com.spring.aop.dcb;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.spring.aop.dcb.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs()[0].toString());
        System.out.println("Before Loggers......");
    }

    @After("execution(* com.spring.aop.dcb.ShoppingCart.checkOut(..))")
    public void afterLogger() {
        System.out.println("After Loggers......");
    }


}
