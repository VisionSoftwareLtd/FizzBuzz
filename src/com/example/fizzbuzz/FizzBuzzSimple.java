package com.example.fizzbuzz;

public class FizzBuzzSimple implements FizzBuzz {
    @Override
    public String[] getValues(int maxValue) {
        String[] values = new String[maxValue];
        for (int i = 1; i <= maxValue; i++) {
            String output = "";
            if (i % 3 == 0)
                output += "Fizz";
            if (i % 5 == 0)
                output += "Buzz";
            values[i-1] = output.equals("") ? Integer.toString(i) : output;
        }
        return values;
    }
}
