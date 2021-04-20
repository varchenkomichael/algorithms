package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N5_CheckAnElementByTheIndexTest {
    @Test
    void checkColorByTheIndex() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N5_CheckAnElementByTheIndex<String> n5_checkAnElementByTheIndex = new N5_CheckAnElementByTheIndex<>(helpList);
       String result  = n5_checkAnElementByTheIndex.checkElementByIndex(3);
        String expectedResult = "Pink";
        assertEquals(expectedResult, result);
    }
}

