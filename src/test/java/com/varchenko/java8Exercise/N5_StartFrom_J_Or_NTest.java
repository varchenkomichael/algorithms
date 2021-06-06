package com.varchenko.java8Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N5_StartFrom_J_Or_NTest {
    private final N5_StartFrom_J_Or_N n5_startFrom_j_or_n = new N5_StartFrom_J_Or_N();

    @Test
    void startFromJ() {
        boolean result = n5_startFrom_j_or_n.startFrom("Naked");
        assertTrue(result);
    }
    @Test
    void startFromN() {
        boolean result = n5_startFrom_j_or_n.startFrom("John");
        assertTrue(result);
    }

    @Test
    void startFrom() {
        boolean result = n5_startFrom_j_or_n.startFrom2("john", 'n', 'j');
        assertTrue(result);
    }
}