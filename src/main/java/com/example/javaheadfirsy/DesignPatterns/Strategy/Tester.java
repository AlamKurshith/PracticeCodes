package com.example.javaheadfirsy.DesignPatterns.Strategy;

public class Tester {

    public static void main(String[] args) {


        PaymentStrategy paymentStrategy = new PaypalPayment("alam@email.com");
        paymentStrategy.pay(12.2);
    }
}
