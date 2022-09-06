package org.sindu;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
/*
    Spring AOP :
    @Aspect -> Advice
    @Before,@After -> Pointcut
    @EnableAspectJAutoProxy -> To enable Aspect
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
    @Before("execution(public void companyName())")
    public void autoCall(){
        System.out.println("Auto call invoked by Aspect->Advice-Pointcut in spring fraework");
    }
}
