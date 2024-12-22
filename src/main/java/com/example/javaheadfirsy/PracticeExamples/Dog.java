package com.example.javaheadfirsy.PracticeExamples;

public class Dog {
    int size;
    String name;

    void bark(int n){
        while(n>0){
            if(size>60){
                System.out.println("Woof woof");
            }
            else if(size > 14){
                System.out.println("Ruff");
            }
            else{
                System.out.println("Yip");
            }
            n--;
        }

    }
}
