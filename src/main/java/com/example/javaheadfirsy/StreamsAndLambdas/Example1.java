package com.example.javaheadfirsy.StreamsAndLambdas;

import java.util.Arrays;

public class Example1 {

        public static void main(String[] args) {
            System.out.println("Filtering Even Numbers");
            int [] nums = {1,2,3,4,5,6,7,8,9,10,11};
            Arrays.stream(nums)
                    .filter(n -> n%2 == 1)
                    .forEach(n -> System.out.println(n));
        }
}
