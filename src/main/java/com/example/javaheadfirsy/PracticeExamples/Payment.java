package com.example.javaheadfirsy.PracticeExamples;

public abstract class Payment {

    private double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    // Abstract method to be implemented
    public abstract void ProcessPayment();

    //Concrete method available for all the payment types
    public double getAmount(){
        return amount;
    }



}
