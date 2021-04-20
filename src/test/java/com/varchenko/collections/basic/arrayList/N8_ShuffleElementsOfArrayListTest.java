package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N8_ShuffleElementsOfArrayListTest {
    @Test
    void shuffleArrayList() {
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        List<Integer> indexList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> shuffleIndexList = new ArrayList<>();
        N8_ShuffleElementsOfArrayList<String> n8_shuffleElementsOfArrayList = new N8_ShuffleElementsOfArrayList<>(helpList);
        List<String> helpIndexList = n8_shuffleElementsOfArrayList.shuffleElement(helpList);
        shuffleIndexList.add(helpIndexList.indexOf("Red"));
        shuffleIndexList.add(helpIndexList.indexOf("Blue"));
        shuffleIndexList.add(helpIndexList.indexOf("Green"));
        shuffleIndexList.add(helpIndexList.indexOf("Pink"));
        shuffleIndexList.add(helpIndexList.indexOf("Black"));
        assertNotEquals(indexList, shuffleIndexList);
    }
}