package com.varchenko.collections.basic.arrayList;

import java.util.Collections;
import java.util.List;

public class N7_SortArrayList<T> {
    private final List<T> list;

    public N7_SortArrayList(List<T> list) {
        this.list = list;
    }

    public List<T> sortArrayList(List<String> listOfColor) {
        Collections.sort(listOfColor);
        return list;
    }
}
