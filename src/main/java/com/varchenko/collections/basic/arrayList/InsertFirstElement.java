package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertFirstElement<T> {
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }

    public void insertFirstEl(ArrayList<String> listOfColor){
        listOfColor.add(0, "Yellow");
    }
}
