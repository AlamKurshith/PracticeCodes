package com.example.javaheadfirsy.CallableAndRunnable;

public class Example2 {

    public static void main(String[] args) {


        int range = 100;
        int numThreads = 20;
        int numsPerThread = range/numThreads;

        for(int i=0; i<numThreads; i++){

            int start = i * numsPerThread+1;
            int end = start + numsPerThread-1;

            Thread thread = new Thread(new NumberPrinter(start, end));
            thread.start();
        }

    }
}
