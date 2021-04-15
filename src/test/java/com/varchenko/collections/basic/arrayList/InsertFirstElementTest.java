package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertFirstElementTest {

    InsertFirstElement<String> insertFirstElement = new InsertFirstElement<>();
    private ArrayList<String> insertFirstColor() {
        ArrayList<String> empty = new ArrayList<>();
        return insertFirstElement.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }

    @Test
    void insertFirstElement() {
    ArrayList<String> result = insertFirstColor();
    insertFirstElement.insertFirstEl(result);
    assertEquals("Yellow", result.get(0));
    }
}