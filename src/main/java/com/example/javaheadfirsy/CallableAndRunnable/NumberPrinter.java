package com.example.javaheadfirsy.CallableAndRunnable;

public class NumberPrinter implements Runnable{

    private int start;
    private int end;

    public NumberPrinter(int start, int end){
        this.start = start;
        this.end = end;
    }



    @Override
    public void run() {

        for(int i=start; i<=end; i++){
            System.out.println( Thread.currentThread().getName() + " : " +  i);
        }

    }
}
