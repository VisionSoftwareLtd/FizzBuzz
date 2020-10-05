package com.example.fizzbuzz;

public class Main {
    public static void main(String[] args) {
//        simpleMethod();
        streamsMethod();
    }

    private static void simpleMethod() {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0)
                output += "Fizz";
            if (i % 5 == 0)
                output += "Buzz";
            System.out.println(output.equals("") ? i : output);
        }
    }

    private static void streamsMethod() {
        FizzBuzzBangStream.create().limit(100).forEach(System.out::println);
    }
}
