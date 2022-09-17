package com.example.demo.aop;

import org.springframework.stereotype.Service;

@Service
public class Payment {
    public void doPayment(){
        System.out.println("pay");
    }
}
