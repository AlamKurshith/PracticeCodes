package com.example.javaheadfirsy.PracticeExamples;

public class StaticMethodExample {

    private static int staticCounter = 0;

    private int instanceCounter = 0;

    public static int IncrementStaticCounter(){
        return staticCounter++;
    }

    public int IncrementInstanceCounter(){
        return instanceCounter++;
    }

}
