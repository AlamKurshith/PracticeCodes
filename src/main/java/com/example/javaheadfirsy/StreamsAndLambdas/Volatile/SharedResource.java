package com.example.javaheadfirsy.StreamsAndLambdas.Volatile;

public class SharedResource {
    private volatile boolean flag = true;
    public void runThread(){
        new Thread( ( ) -> {
            while(flag){
                System.out.println("Running thread");
            }
            System.out.println("Thread is stopped");
        } ).start();
    }
    public void stopThread(){
        flag = false; // These updated will be immediately visible to the other threads;
    }
}
