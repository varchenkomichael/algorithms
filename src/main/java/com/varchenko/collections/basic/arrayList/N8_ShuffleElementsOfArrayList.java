package com.varchenko.collections.basic.arrayList;

import java.util.Collections;
import java.util.List;

public class N8_ShuffleElementsOfArrayList<T> {
    private List<T> list;

    public N8_ShuffleElementsOfArrayList(List<T> list) {
        this.list = list;
    }

    public List<T> shuffleElement(List<T> listOfColor) {
        Collections.shuffle(listOfColor);
        return list;
    }
}
