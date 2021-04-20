package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N4_RemoveElementFromArrayListTest {
     @Test
    void removeThirdElement() {
         List<String> result = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
         N4_RemoveElementFromArrayList<String> n4_removeElementFromArrayList = new N4_RemoveElementFromArrayList<>(result);
         n4_removeElementFromArrayList.removeElement("Green");
         List<String> expectedResult = new ArrayList<>(Arrays.asList("Red", "Blue", "Pink", "Black"));
         assertEquals(expectedResult, result);
     }
    }
