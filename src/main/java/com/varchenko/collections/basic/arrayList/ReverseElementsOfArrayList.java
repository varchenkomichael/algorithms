package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseElementsOfArrayList<T> {
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }
    public void reverseElement(ArrayList<T> listOfColor){
        Collections.reverse(listOfColor);
    }
}
