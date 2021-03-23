package com.varchenko;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class FibonacciSequenceTest {
    private final FibonacciSequence fibonacciSequence = new FibonacciSequence();

    @Test
    void Fibonacci_1() {
        BigInteger expectedResult = BigInteger.ONE;
        BigInteger result = fibonacciSequence.fiboNumberFrom0to100(1);
        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_10() {
        BigInteger expectedResult = BigInteger.valueOf(55);
        BigInteger result = fibonacciSequence.fiboNumberFrom0to100(10);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_99() {
        BigInteger expectedResult = new BigInteger("218922995834555169026");
        BigInteger result = fibonacciSequence.fiboNumberFrom0to100(99);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_0() {
        BigInteger expectedResult = BigInteger.ZERO;
        BigInteger result = fibonacciSequence.fiboNumberFrom0to100(0);

        assertEquals(expectedResult, result);
    }

    @Test
    void Fibonacci_negative() {
        RuntimeException runtimeException = assertThrows(IllegalArgumentException.class, () -> fibonacciSequence.fiboNumberFrom0to100(-5));
        assertEquals(IllegalArgumentException.class, runtimeException.getClass());
    }

    @Test
    void Fibonacci_enormous() {
        RuntimeException runtimeException = assertThrows(IllegalArgumentException.class,
                () -> fibonacciSequence.fiboNumberFrom0to100(100000));
        assertEquals(IllegalArgumentException.class, runtimeException.getClass());
    }
 @Test
    void FibonacciAllNunbers() {

        List<BigInteger> expectedResult = List.of(BigInteger.ZERO, BigInteger.ONE);
     List<BigInteger> result = fibonacciSequence.getAllFiboNumbers(99);
     assertEquals(99, result.size());
 }
}
