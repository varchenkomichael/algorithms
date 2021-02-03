package com.varchenko;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static com.varchenko.FibonacciSequence.fib;

public class FibonacciSequenceTest {
    FibonacciSequence fibonacciSequence = new FibonacciSequence() ;
        @Test
        void Fibonacci_numbersFrom0to10() {
            for (int index = 0; index < 10; index++) {

                int expectedResult = fib(index);

                int result = fib(index);
                assertEquals(expectedResult, result);
                System.out.println(fib(index));
            }
        }

        @Test
        void Fibonacci_SpecificNumber() {
            int expectedResult = fib(10);
            int result = 55;

            assertEquals(expectedResult, result);
            System.out.println(fib(10));
        }
    }
