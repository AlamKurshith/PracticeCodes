package com.example.javaheadfirsy.PracticeExamples;

public class CreditCardPayment extends  Payment{

    private String cardNumber;


    public CreditCardPayment(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;

    }

    @Override
    public void ProcessPayment() {
        System.out.println("Processing payment of $ " + getAmount() + " using card: " + cardNumber);
    }
}
