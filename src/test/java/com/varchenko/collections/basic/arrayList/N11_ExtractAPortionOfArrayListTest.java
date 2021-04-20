package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N11_ExtractAPortionOfArrayListTest {
    @Test
    void extractAPortionOfArrayList() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N11_ExtractAPortionOfArrayList<String> n11_extractAPortionOfArrayList = new N11_ExtractAPortionOfArrayList<>(helpList);
        List<String> result = n11_extractAPortionOfArrayList.extractAPortion(0, 3);
        List<String> expectedResult = new ArrayList<>(Arrays.asList("Red", "Blue", "Green"));
        assertEquals(expectedResult, result);
    }
}