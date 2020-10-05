package com.example.fizzbuzz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzzSimple();
        Arrays.stream(fizzBuzz.getValues(100)).forEach(System.out::println);
    }
}
