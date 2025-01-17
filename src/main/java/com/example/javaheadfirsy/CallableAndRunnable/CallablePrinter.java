package com.example.javaheadfirsy.CallableAndRunnable;

import java.util.concurrent.Callable;

public class CallablePrinter implements Callable<Void> {

    int start;
    int end;

    public CallablePrinter(int start, int end){
        this.start = start;
        this.end = end;
    }




    @Override
    public Void call(){
        for(int i=start; i<=end; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
       return null;
    }
}
