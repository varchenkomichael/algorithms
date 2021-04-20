package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.List;

public class N15_CloneArrayList<T> {
    private final List<T> list;

    public N15_CloneArrayList(List<T> list) {
        this.list = list;
    }

    public List<T> cloneArrayList(List<T> listOfColor) {
        new ArrayList<>(listOfColor).clone();
        return list;
    }
}
