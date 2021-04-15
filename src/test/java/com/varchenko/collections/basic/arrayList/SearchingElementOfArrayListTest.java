package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchingElementOfArrayListTest {
    SearchingElementOfArrayList<String> searchingElementOfArrayList = new SearchingElementOfArrayList();
    private ArrayList<String> searchElementOfArrayList() {
        ArrayList<String> empty = new ArrayList<>();
        return searchingElementOfArrayList.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
     @Test
    void searchThirdElementOfArrayList() {
        ArrayList<String> result = searchElementOfArrayList();
        searchingElementOfArrayList.searchElement(result);
        assertTrue(result.contains("Green"));
     }
}