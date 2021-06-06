package com.varchenko.java8Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class N2_NotNullTest {

    @Test
    void notNull() {
        N2_NotNull n2_notNull = new N2_NotNull();
        boolean result = n2_notNull.notNull("Hello");
        assertTrue(result);
    }
}