package com.example.javaheadfirsy.StreamsAndLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("Cat", "Dog", "Elephant", "Lion", "Duck", "Ant", "Eagle", "Peacock");

        Map<Integer, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(result);
    }
}
