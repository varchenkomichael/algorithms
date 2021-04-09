package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class N1_CreateAddAndPrintTest {
    N1_CreateAddAndPrint<String> createAddAndPrint = new N1_CreateAddAndPrint<>();

    @Test
    void createCollection() {
        ArrayList<String> collection = createAddAndPrint.createCollection();

        assertEquals(ArrayList.class, collection.getClass());
        assertEquals(0, collection.size());
    }

    @Test
    void addElements() {
        ArrayList<String> result = createAndFillArrayList();
        assertEquals(5, result.size());
        assertEquals("Red", result.get(0));
        assertEquals("Black", result.get(4));
    }

    /**
     * This code is possible to test, but the result is pretty messy.
     * @implSpec Don't write tests System.out.println methods!
     */
    @Test
    void printElements() {
        ArrayList<String> result = createAndFillArrayList();
        createAddAndPrint.printElements(result);
    }

    private ArrayList<String> createAndFillArrayList() {
        ArrayList<String> empty = new ArrayList<>();
        return createAddAndPrint.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
}