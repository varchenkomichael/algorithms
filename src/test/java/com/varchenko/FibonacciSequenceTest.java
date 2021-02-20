package com.varchenko;

import org.junit.jupiter.api.Test;

import static com.varchenko.FibonacciSequence.fib;
import static org.junit.jupiter.api.Assertions.*;


public class FibonacciSequenceTest {
    FibonacciSequence fibonacciSequence = new FibonacciSequence();

    @Test
    void Fibonacci_1() {
        int expectedResult = 1;
        int result = fib(1);
        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_10() {
        int expectedResult = 55;
        int result = fib(10);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_0() {
        int expectedResult = 0;
        int result = fib(0);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_negative() {
        int expectedResult = -1;
        int result = fib(-1);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_enormous() {
        assertThrows(RuntimeException.class, () -> {
            int expectedResult = 1;
            int result = fib(100000);
            assertEquals(expectedResult, result);
        });
    }
}
