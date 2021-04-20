package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N13_SwapElementInArrayListTest {
    @Test
    void swapElement() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N13_SwapElementInArrayList<String> n13_swapElementInArrayList = new N13_SwapElementInArrayList<>(helpList);
        List<String> result = n13_swapElementInArrayList.swapElement(helpList, 0, 3);
        List<String> expectedResult = new ArrayList<>(Arrays.asList("Pink", "Blue", "Green", "Red", "Black"));
        assertEquals(expectedResult, result);
    }
}