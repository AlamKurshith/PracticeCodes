package com.example.javaheadfirsy.StreamsAndLambdas.Volatile;

public class VolatileExample{

    public static void main(String[] args) throws InterruptedException{
        SharedResource resource = new SharedResource();

        resource.runThread();
        Thread.sleep(1000);
        resource.stopThread();
    }
}
