package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompareTwoArrayListTest {
    CompareTwoArrayList<String> compareTwoArrayList = new CompareTwoArrayList();
    private ArrayList<String> compareTwoArrayList() {
        ArrayList<String> empty = new ArrayList<>();
        return compareTwoArrayList.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
    @Test
    void comparesTwoArrayList(){
        ArrayList<String> result = compareTwoArrayList();
    }
}