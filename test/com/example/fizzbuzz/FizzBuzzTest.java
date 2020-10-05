package com.example.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void simpleTest() {
        FizzBuzz fizzBuzzSimple = new FizzBuzzSimple();
        checkTo15(fizzBuzzSimple.getValues(15));
    }

    @Test
    public void streamTest() {
        FizzBuzz fizzBuzzStream = new FizzBuzzStream();
        checkTo15(fizzBuzzStream.getValues(15));
    }

    private void checkTo15(String[] values) {
        String[] expectedValues = {
                "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"
        };
        for (int i = 0; i < expectedValues.length; i++) {
            assertEquals(expectedValues[i], values[i]);
        }
    }
}