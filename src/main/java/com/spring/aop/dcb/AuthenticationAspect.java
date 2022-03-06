package com.spring.aop.dcb;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com.spring.aop.dcb.*)")
    public void authenticatingPointcut() {

    }

    @Pointcut("within(com.spring.aop.dcb.*)")
    public void authorizationPointcut() {

    }

    @Before("authenticatingPointcut() && authorizationPointcut()")
    public void authenticate() {
        System.out.println("Authenticating the request.........");
    }
}
