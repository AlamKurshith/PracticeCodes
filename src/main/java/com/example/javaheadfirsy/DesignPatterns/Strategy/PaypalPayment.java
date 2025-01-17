package com.example.javaheadfirsy.DesignPatterns.Strategy;

public class PaypalPayment implements PaymentStrategy{

    private String email;

    public PaypalPayment(String email){
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid amount of " + amount + " using email : " + email);

    }
}
