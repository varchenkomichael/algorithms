package com.varchenko;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FibonacciSequenceTest {
    private final FibonacciSequence fibonacciSequence = new FibonacciSequence();

    @Test
    void Fibonacci_1() {
        BigInteger expectedResult = BigInteger.ONE;
        BigInteger result = fibonacciSequence.generalMethod(1);
        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_10() {
        BigInteger expectedResult = BigInteger.valueOf(55);
        BigInteger result = fibonacciSequence.generalMethod(10);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_99() {
        BigInteger expectedResult = new BigInteger("218922995834555169026");
        BigInteger result = fibonacciSequence.generalMethod(99);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_0() {
        BigInteger expectedResult = BigInteger.ZERO;
        BigInteger result = fibonacciSequence.generalMethod(0);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_negative() {
        RuntimeException runtimeException = assertThrows(IllegalArgumentException.class, () -> fibonacciSequence.generalMethod(-5));
        assertEquals(IllegalArgumentException.class, runtimeException.getClass());
    }

    @Test
    void Fibonacci_enormous() {
        RuntimeException runtimeException = assertThrows(IllegalArgumentException.class,
                () -> fibonacciSequence.generalMethod(100000));
        assertEquals(IllegalArgumentException.class, runtimeException.getClass());
    }

}
