package com.example.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionService {

    @Pointcut("execution(public void com.example.demo.aop.Payment.doPayment())")
    public void p1(){

    }

    @Before("p1()")
    public void begin(){
        System.out.println("begin");
    }
    @After("p1()")
    public void after(){
        System.out.println("after");
    }
}
