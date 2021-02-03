package com.varchenko;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static com.varchenko.FibonacciSequence.fib;

public class FibonacciSequenceTest {
    private final FibonacciSequence fibonacciSequence = new FibonacciSequence();

        @Test
        void Fibonacci_number() {
            for (int index=0; index<10; index++){

            int expectedResult = fib(index);

            int result = fibonacciSequence.fib(index);
            assertEquals(expectedResult, result);
            System.out.println(fib(index));
        }
}
}