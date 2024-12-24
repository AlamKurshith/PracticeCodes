package com.example.javaheadfirsy.DesignPatterns.Builder;

public class Example1 {

    public static void main(String[] args) {

//        Object obj = new Object();
//        System.out.println(obj.toString());

//        Person p  = new Person("Alam", 22);
//        System.out.println(p.toString());

        //Using a chaining method to create and initialize a Person object

        Person person1 = new Person().
                setName("Alam")
                .setAge(22)
                .setGender("Male")
                .setCity("TVM");

        System.out.println(person1);
    }
}



