package com.example.javaheadfirsy.CallableAndRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tester {

    public static void main(String[] args) {

//        Thread thread1 = new Thread(new NumberPrinter(1,50));
//        Thread thread2 = new Thread(new NumberPrinter(51,150));
//
//        thread2.start();
//        thread1.start();

        int range = 100;
        int numThread = 20;
        int numbersPerThread = range / numThread;

//        Example for Callable with multi thread:

//        ExecutorService executorService = Executors.newFixedThreadPool(numThread);
//        List<Future<Void>> futures = new ArrayList<>();
//        for(int i=0; i<numThread; i++){
//            int start = i*numbersPerThread+1;
//            int end = start + numbersPerThread-1;
//            Future<Void> result = executorService.submit(new CallablePrinter(start, end));
//            futures.add(result);
//        }
//        executorService.shutdown();

//        Example for Runnable with multi thread:

        for(int i=0; i<numThread; i++){
            int start = i *numbersPerThread+1;
            int end = start+numbersPerThread-1;
            System.out.println("From the Runnable loop");
            Thread thread = new Thread(new RunnableNumberPrinter(start, end));
            thread.start();
        }






    }

}
