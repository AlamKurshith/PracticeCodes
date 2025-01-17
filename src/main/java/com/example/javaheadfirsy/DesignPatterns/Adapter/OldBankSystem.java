package com.example.javaheadfirsy.DesignPatterns.Adapter;

public class OldBankSystem {

    public double getBalance(){
        return 50000.0;
    }

    public String fundTransfer(String from, String to, double amount){

        return "Amount of rupees " + amount + " has been successfully transferred from " + from + " to " + to;

    }
}
