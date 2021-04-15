package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementFromArrayListTest {
    RemoveElementFromArrayList<String> removeElementFromArrayList = new RemoveElementFromArrayList<>();
    private ArrayList<String> removingElementFromArrayList() {
        ArrayList<String> empty = new ArrayList<>();
        return removeElementFromArrayList.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
    @Test
    void removeElementFromArrayList(){
        ArrayList<String> result = removingElementFromArrayList();
        removeElementFromArrayList.removesElement(result);
        assertFalse(result.contains("Pink"));
    }
}