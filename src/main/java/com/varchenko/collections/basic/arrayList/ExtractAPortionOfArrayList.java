package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractAPortionOfArrayList<T> {
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }
    public void extractPortionOfArrayList(ArrayList<String> listOfColor){
        List<String> sublist = listOfColor.subList(0, 3);
        listOfColor.addAll(sublist);
    }
}
