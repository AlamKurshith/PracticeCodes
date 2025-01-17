package com.example.javaheadfirsy.CallableAndRunnable;

public class RunnableNumberPrinter implements Runnable{
    int start;
    int end;
    public RunnableNumberPrinter(int s, int e){
        this.start = s;
        this.end = e;
    }

    @Override
    public void run(){

        for(int i=start; i<=end; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }

    }
}
