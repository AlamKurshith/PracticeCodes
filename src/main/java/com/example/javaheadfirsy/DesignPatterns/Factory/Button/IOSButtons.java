package com.example.javaheadfirsy.DesignPatterns.Factory.Button;

public class IOSButtons implements Button{

    @Override
    public void changeSize() {
        System.out.println("IOS buttons are updating");
    }
}
