package com.varchenko.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N2_ReverseIntegerTest {

    @Test
    void reversePositiveInteger() {
        int x = 1234;
        N2_ReverseInteger n2_reverseInteger = new N2_ReverseInteger();
        int result = n2_reverseInteger.reverseInteger(x);
        int expectedResult = 4321;
        assertEquals(expectedResult, result);
    }
    @Test
    void reverseNegativeInteger(){
        int x = -1234;
        N2_ReverseInteger n2_reverseInteger = new N2_ReverseInteger();
        int result = n2_reverseInteger.reverseInteger(x);
        int expectedResult = -4321;
        assertEquals(expectedResult, result);
    }
    @Test
    void reverseZero(){
        int x = 0;
        N2_ReverseInteger n2_reverseInteger = new N2_ReverseInteger();
        int result = n2_reverseInteger.reverseInteger(x);
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }
}