package com.example.javaheadfirsy.DesignPatterns.Strategy;

import com.example.javaheadfirsy.PracticeExamples.Payment;

public class ContextClass {
    private PaymentStrategy paymentStrategy;;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount){
        if(paymentStrategy == null){
            System.out.println("No payment mode is selected");
        }
        paymentStrategy.pay(amount);
    }
}
