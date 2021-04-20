package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N10_ReverseElementsOfArrayListTest {
    @Test
    void reverseArrayList() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N10_ReverseElementsOfArrayList<String> n10_reverseElementsOfArrayList = new N10_ReverseElementsOfArrayList<>(helpList);
        List<String> result = n10_reverseElementsOfArrayList.reverseArrayList(helpList);
        List<String> expectedResult = new ArrayList<>(Arrays.asList("Black", "Pink", "Green", "Blue", "Red"));
        assertEquals(expectedResult, result);
    }
}