package com.example.javaheadfirsy;

public class Wolf extends Canine{

    @Override
    public void makeNoise() {
        System.out.println("Wolf noise...");
    }

    @Override
    public void eat() {
        System.out.println("Wolf Eating...");
    }
}
