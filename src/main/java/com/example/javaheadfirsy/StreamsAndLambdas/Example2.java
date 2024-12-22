package com.example.javaheadfirsy.StreamsAndLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args){

        // This is an Exercise to convert all the string to upper case using streams

        List<String> words = Arrays.asList("Apple", "Banana", "Cherry");

        List<String> toUpperCase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(toUpperCase);
    }


}
