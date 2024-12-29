package com.example.javaheadfirsy.DesignPatterns.Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){

        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create an instance of this singleton class");
        }

    }

    public static Singleton getInstance(){

        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton Instance : " + this.hashCode());
    }
}
