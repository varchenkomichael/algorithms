package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseElementsOfArrayListTest {
     ReverseElementsOfArrayList<String> reverseElementsOfArrayList = new ReverseElementsOfArrayList<>();
    private ArrayList<String> reverseElement() {
        ArrayList<String> empty = new ArrayList<>();
        return reverseElementsOfArrayList.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
    @Test
    void reverseElementsOfArrayList(){
      ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("Black", "Pink", "Green", "Blue", "Red"));
      ArrayList<String> result = reverseElement();
      reverseElementsOfArrayList.reverseElement(result);
      assertEquals(expectedResult, result);
    }
}