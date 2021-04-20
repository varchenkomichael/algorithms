package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N12_CompareTwoArrayListTest {
    @Test
    void compareTwoArrayLists() {
        List<String> wrongList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink"));
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N12_CompareTwoArrayList<String> n12_compareTwoArrayList = new N12_CompareTwoArrayList<>(wrongList);
        boolean result = n12_compareTwoArrayList.compareTwoArrayLists(helpList);
        assertFalse(result);
    }
}