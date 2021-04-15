package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtractAPortionOfArrayListTest {
    ExtractAPortionOfArrayList<String> extractAPortionOfArrayList = new ExtractAPortionOfArrayList<>();
    private ArrayList<String> extractPortion() {
        ArrayList<String> empty = new ArrayList<>();
        return extractAPortionOfArrayList.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
    @Test
    void extractPortionOfArrayList(){
        ArrayList<String> result = extractPortion();
        extractAPortionOfArrayList.extractPortionOfArrayList(result);
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black", "Red", "Blue", "Green"));
        assertEquals(result, expectedResult);
    }
}