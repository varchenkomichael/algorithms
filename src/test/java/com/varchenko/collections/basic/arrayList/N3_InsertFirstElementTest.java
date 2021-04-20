package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N3_InsertFirstElementTest {

    @Test
    void insertFirstElement() {
        List<String> result = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N3_InsertFirstElement<String> n3_insertFirstElement = new N3_InsertFirstElement<>(result);
        n3_insertFirstElement.insertFirstElement("Yellow");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("Yellow", "Red", "Blue", "Green", "Pink", "Black"));
        assertEquals(expectedResult, result);
    }
}