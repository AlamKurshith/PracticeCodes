package com.example.javaheadfirsy.CallableAndRunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

    public static void main(String[] args) {

        Callable<String> task = ()-> {
            System.out.println("Task is running in thread: " + Thread.currentThread().getName());
            return "End of result";
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(task);

        try{
            String result = future.get();
            System.out.println(result);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            service.shutdown();
        }
    }
}
