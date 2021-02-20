package com.varchenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShowBitsTest {
    ShowBits b = new ShowBits(8);
    ShowBits l = new ShowBits(16);

    @Test
    void show123_in_binary() {

        int expectedResult = 0;
        int result = b.show(123);

        assertEquals(expectedResult, result);
    }

    @Test
    void show87987_In_Binary() {

        int expectedResult = 0;

        int result = l.show(87987);

        assertEquals(expectedResult, result);
    }

    @Test
    void negative_Number_in_Binary() {
        assertThrows(RuntimeException.class, () -> {
            int expectedResult = 0;
            int result = l.show(-234);
            assertEquals(expectedResult, result);
        });
    }
}
