package com.example.demo.controller;

import com.example.demo.aop.Payment;
import com.example.demo.aop.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {


    @Autowired
    private Payment payment;

    @GetMapping
    public String get(){

        payment.doPayment();
        return "hi";
    }
}
