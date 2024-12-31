package com.example.javaheadfirsy.PracticeExamples;

public class Test1 {

    public static void main(String[] args) {

        StaticMethodExample staticMethodExample = new StaticMethodExample();


        int instanceCount = staticMethodExample.IncrementInstanceCounter();
        System.out.println("Instance count : " + instanceCount );
        System.out.println("Static count : " + StaticMethodExample.IncrementStaticCounter());

        StaticMethodExample staticMethodExample2 = new StaticMethodExample();


        int instanceCount2 = staticMethodExample2.IncrementInstanceCounter();
        System.out.println("Instance count : " + instanceCount2 );
        System.out.println("Static count : " +  StaticMethodExample.IncrementStaticCounter());
    }
}

