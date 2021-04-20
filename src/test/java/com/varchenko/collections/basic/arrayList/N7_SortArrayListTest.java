package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N7_SortArrayListTest {
    @Test
    void sortArrayList() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N7_SortArrayList<String> n7_sortArrayList = new N7_SortArrayList<>(helpList);
        List<String> result = n7_sortArrayList.sortArrayList(helpList);
        List<String> expectedResult = new ArrayList<>(Arrays.asList("Black", "Blue", "Green", "Pink", "Red"));
        assertEquals(expectedResult, result);
    }
}