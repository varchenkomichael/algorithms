package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N16_EmptyArrayListTest {
    @Test
    void emptyArrayList() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N16_EmptyArrayList<String> n16_emptyArrayList = new N16_EmptyArrayList<>(helpList);
        List<String> result = n16_emptyArrayList.emptyArrayList(helpList);
        List<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, result);
    }

}