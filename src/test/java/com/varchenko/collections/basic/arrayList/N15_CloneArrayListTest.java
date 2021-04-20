package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N15_CloneArrayListTest {
    @Test
    void cloneArrayList() {
        List<String> arrayToCopy = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N15_CloneArrayList<String> n15_cloneArrayList = new N15_CloneArrayList<>(arrayToCopy);
        List<String> result = n15_cloneArrayList.cloneArrayList(arrayToCopy);
        assertEquals(arrayToCopy, result);
    }
}