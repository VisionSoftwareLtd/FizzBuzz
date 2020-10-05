package com.example.fizzbuzz;

import java.util.stream.Stream;

public class FizzBuzzStream implements FizzBuzz {
    private volatile int i = 0;

    public Stream<String> create() {
        return Stream.generate(() -> {
            i++;
            String output = "";
            if (i % 3 == 0)
                output += "Fizz";
            if (i % 5 == 0)
                output += "Buzz";
            return (output.equals("") ? Integer.toString(i) : output);
        });
    }
    @Override
    public String[] getValues(int maxValue) {
        return create().limit(100).toArray(String[]::new);
    }
}
