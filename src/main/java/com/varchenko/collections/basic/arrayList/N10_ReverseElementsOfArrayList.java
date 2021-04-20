package com.varchenko.collections.basic.arrayList;


import java.util.Collections;
import java.util.List;

public class N10_ReverseElementsOfArrayList<T> {
    private List<T> list;

    public N10_ReverseElementsOfArrayList(List<T> list) {
        this.list = list;
    }

    public List<T> reverseArrayList(List<T> listOfColor) {
        Collections.reverse(listOfColor);
        return list;
    }
}
