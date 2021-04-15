package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckAnElementByTheIndexTest {
    СheckAnElementByTheIndex<String> сheckAnElementByTheIndex = new СheckAnElementByTheIndex<>();
    private ArrayList<String> checkedArrayIndexes() {
        ArrayList<String> empty = new ArrayList<>();
        return сheckAnElementByTheIndex.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }

    @Test
    void checkAnElementByTheIndex(){
        ArrayList<String> result = checkedArrayIndexes();
        assertEquals("Green", result.get(2));
        assertEquals("Blue", result.get(1));
        assertEquals("Pink", result.get(3));
    }
}
