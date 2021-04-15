package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpdateAnElementOfArrayListTest {
    UpdateAnElementOfArrayList<String> updateAnElementOfArrayList = new UpdateAnElementOfArrayList();

    private ArrayList<String> updatedArrayList() {
        ArrayList<String> empty = new ArrayList<>();
        return updateAnElementOfArrayList.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
    @Test
    void checkUpdateArrayListELements(){
        ArrayList<String> updateList = updatedArrayList();
        updateAnElementOfArrayList.updateAnElementOfArrayList(updateList);
        assertEquals("Purple", updateList.get(2));
    }
}