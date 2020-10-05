package com.example.fizzbuzz;

import java.util.stream.Stream;

public class FizzBuzzBangStream {
    private static volatile int i = 0;

    public static Stream<String> create() {
        Stream<String> stream = Stream.generate(() -> {
            i++;
            String output = "";
            if (i % 3 == 0)
                output += "Fizz";
            if (i % 5 == 0)
                output += "Buzz";
            return (output.equals("") ? Integer.toString(i) : output);
        });
        return stream;
    }
}
