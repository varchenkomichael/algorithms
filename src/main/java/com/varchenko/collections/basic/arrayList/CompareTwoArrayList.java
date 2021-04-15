package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrayList<T> {
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }
    public void compareTwoArrayList(ArrayList<Boolean> listOfColor){
        ArrayList<String> secondArrayList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Black"));

    }
}
