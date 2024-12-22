package com.example.javaheadfirsy.PracticeExamples;

public class GoodDog {
    private int size;
    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(){
        if(size>60){
            System.out.println("Heavy bark");
        }
        else if(size > 14){
            System.out.println("Medium level bark");
        }
        else{
            System.out.println("Low bark");
        }
    }
}
