package com.varchenko.java8Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N7_NegativeOrPositiveTest {
private final N7_NegativeOrPositive n7_negativeOrPositive = new N7_NegativeOrPositive();
    @Test
    void positive() {
       String result = n7_negativeOrPositive.positiveOrNegativeOrNull(12);
        assertEquals(result, "1");
    }
    @Test
    void negative(){
       String result = n7_negativeOrPositive.positiveOrNegativeOrNull(-2);
        assertEquals(result, "-1");
    }
    @Test
    void nullEq(){
        String result = n7_negativeOrPositive.positiveOrNegativeOrNull(0);
        assertEquals(result, "0");

    }
}