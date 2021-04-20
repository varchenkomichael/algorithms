package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N2_UpdateAnElementOfArrayListTest {
    @Test
    void updateElementOfArrayList() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N2_UpdateAnElementOfArrayList<String> n2_updateAnElementOfArrayList = new N2_UpdateAnElementOfArrayList<>(helpList);
        List<String> result = n2_updateAnElementOfArrayList.updateElement("Yellow", 2);
        List<String> expectedResult = new ArrayList<>(Arrays.asList("Red", "Blue", "Yellow", "Pink", "Black"));
        assertEquals(expectedResult, result);
    }
}