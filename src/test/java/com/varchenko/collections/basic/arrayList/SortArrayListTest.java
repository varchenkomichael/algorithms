package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayListTest {
    SortArrayList<String> sortArrayList = new SortArrayList();
    private ArrayList<String> sortingArrayList() {
        ArrayList<String> empty = new ArrayList<>();
        return sortArrayList.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
    @Test
    void sortArrayList(){
        ArrayList<String> result = sortingArrayList();
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("Black", "Blue", "Green", "Pink", "Red"));
        sortArrayList.sortingArray(result);
        assertEquals(result, expectedResult);
    }
}