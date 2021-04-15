package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchingElementOfArrayList<T> {
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }
    public void searchElement(ArrayList<String> listOfColor){
        listOfColor.contains("Green");
    }
}
