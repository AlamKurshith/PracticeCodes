package com.example.javaheadfirsy.DesignPatterns.Adapter;

public interface BankingAPI {
    public double checkBalance();
    public String sendMoney(String from, String to, double amount);
}
