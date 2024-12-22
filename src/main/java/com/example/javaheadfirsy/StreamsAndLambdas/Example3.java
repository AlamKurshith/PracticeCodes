package com.example.javaheadfirsy.StreamsAndLambdas;

import java.util.Arrays;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        //SUM OF SQUARES OF ODD NUMBERS

        int [] numbers = {1,2,3,4,5};

        int sumOfOddSquares = Arrays.stream(numbers)

                .map(n ->{
                    System.out.println("Mapping " + n);
                    return n*n;
                })
                .filter(n ->{
                    System.out.println("Filtering " + n);
                    return n%2 == 0;
                })
                .reduce(0, (a,b) ->{
                    System.out.println("Reducing " + a + " and " + b);
                    return a+b;
                });

        System.out.println(sumOfOddSquares);
    }
}
