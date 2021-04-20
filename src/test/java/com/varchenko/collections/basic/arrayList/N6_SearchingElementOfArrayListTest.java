package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N6_SearchingElementOfArrayListTest {
    @Test
    void searchElementOfArrayList() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N6_SearchingElementOfArrayList<String> n6_searchingElementOfArrayList = new N6_SearchingElementOfArrayList<>(helpList);
        boolean result = n6_searchingElementOfArrayList.searchElement("Black");
        boolean result2 = n6_searchingElementOfArrayList.searchElement("Yellow");
        assertFalse(result2);
        assertTrue(result);
    }
}