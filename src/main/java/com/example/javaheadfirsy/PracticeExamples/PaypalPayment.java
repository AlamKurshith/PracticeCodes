package com.example.javaheadfirsy.PracticeExamples;

public class PaypalPayment extends Payment implements DigitalPayment{

    private String email;

    public PaypalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void ProcessPayment() {

        System.out.println("Processing payment of amount $ " + getAmount() + " for account " + email);

    }

    @Override
    public void sendReceipt(String email) {
        System.out.println("Receipt sent to email:  " + email);
    }
}
