package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayListToAnotherTest {
    CopyArrayListToAnother<String> copyArrayListToAnother = new CopyArrayListToAnother();
    private ArrayList<String> copyArrayList() {
        ArrayList<String> empty = new ArrayList<>();
        return copyArrayListToAnother.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }

    @Test
    void copyArrayListToAnother() {
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        ArrayList<String> result = copyArrayList();
        copyArrayListToAnother.copyArrayList(result);
        assertEquals(expectedResult, result);
    }
}