package com.example.javaheadfirsy.DesignPatterns.Factory.Button;

public class AndroidButtons implements Button{
    @Override
    public void changeSize() {
        System.out.println("Android buttons are updating");
    }
}
