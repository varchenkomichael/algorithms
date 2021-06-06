package com.varchenko.java8Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class N4_NotNullAndNotEmptyTest {
    private final  N4_NotNullAndNotEmpty n4_notNullAndNotEmpty = new N4_NotNullAndNotEmpty();

    @Test
    void notEmptyAndNotNull() {
        boolean result = n4_notNullAndNotEmpty.notEmptyAndNotNull("Hello");
        assertTrue(result);
    }
    @Test
    void emptyAndNotNull() {
        boolean result = n4_notNullAndNotEmpty.notEmptyAndNotNull("");
        assertFalse(result);
    }
}