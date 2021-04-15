package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementFromArrayList<T> {
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }
    public void removesElement(ArrayList<String> listOfColor ){
        listOfColor.remove(3);
    }
}
