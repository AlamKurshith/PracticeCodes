package com.example.javaheadfirsy.DesignPatterns.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Pain amount " + amount + " using credit card number : " + cardNumber);

    }
}
