package com.example.javaheadfirsy.DesignPatterns.Adapter;

public class BankingAdapter implements BankingAPI{

    private OldBankSystem oldBankSystem;

    @Override
    public double checkBalance() {
        return oldBankSystem.getBalance();
    }

    public BankingAdapter(OldBankSystem oldBankSystem){
        this.oldBankSystem = oldBankSystem;
    }

    @Override
    public String sendMoney(String from, String to, double amount) {
        return oldBankSystem.fundTransfer(from, to, amount);
    }
}
