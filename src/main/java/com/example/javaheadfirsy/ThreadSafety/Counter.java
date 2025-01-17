package com.example.javaheadfirsy.ThreadSafety;

public class Counter {

    private int count;


    public void increment(){
        synchronized(this){
            count++;
        }
    }

    public int getCount(){
        synchronized(this){
            return count;
        }
    }


}
