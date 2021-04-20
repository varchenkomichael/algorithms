package com.varchenko.collections.basic.arrayList;

import java.util.Collections;
import java.util.List;

public class N13_SwapElementInArrayList<T> {
    private List<T> list;

    public N13_SwapElementInArrayList(List<T> list) {
        this.list = list;
    }

    public List<T> swapElement(List<T> listOfColor, int fromIndex, int toIndex) {
        Collections.swap(listOfColor, fromIndex, toIndex);
        return list;
    }
}
