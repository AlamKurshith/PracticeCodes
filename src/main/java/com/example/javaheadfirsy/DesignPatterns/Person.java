package com.example.javaheadfirsy.DesignPatterns;

public class Person {

    private String name;
    private int age;
    private String gender;
    private String city;

    public Person setName(String name){
        this.name = name;
        return this;
    }

    public Person setAge(int age){
        this.age = age;
        return this;
    }
    public Person setGender(String gender){
        this.gender = gender;
        return this;
    }
    public Person setCity(String city){
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Name = " + name +
                ", Age = " + age +
                ", Gender = " + gender +
                ", City = " + city +
                "}";
    }
}
