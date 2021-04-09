package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
 * @see com.varchenko.collections.basic.arrayList.N1_CreateAddAndPrintTest for the test implementation.
 */
public class N1_CreateAddAndPrint<T> {

    public ArrayList<T> createCollection() {
        return new ArrayList<T>();
    }

    /**
     * Just put @SafeVarargs to remove the warning :)
     * @implNote Don't use varargs for the implementations.
     */
    @SafeVarargs
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }

    public void printElements(ArrayList<T> elementsToPrint) {
        for (T t : elementsToPrint) {
            System.out.println(t);
        }
    }
}
