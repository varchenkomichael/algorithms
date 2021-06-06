package com.varchenko.java8Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N3_NotEmptyTest {
    private final N3_NotEmpty n3_notEmpty = new N3_NotEmpty();

    @Test
    void notEmpty() {
        boolean result = n3_notEmpty.notEmpty("hui");
        assertTrue(result);
    }

    @Test
    void Empty() {
        boolean result = n3_notEmpty.notEmpty("");
        assertFalse(result);
    }
}