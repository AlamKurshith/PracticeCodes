package com.example.javaheadfirsy.DesignPatterns.Singleton;

public class Test {

    public static void main(String[] args) {


        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        System.out.println("Are both same  ? " +  (singleton1 == singleton));
    }
}
