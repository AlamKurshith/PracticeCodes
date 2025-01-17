package com.example.javaheadfirsy.CallableAndRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println(" (Using runnable) This is running in thread ; " + Thread.currentThread().getName());
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(task);

        executorService.shutdown();

    }
}
