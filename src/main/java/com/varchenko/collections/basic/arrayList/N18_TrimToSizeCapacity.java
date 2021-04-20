package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.List;

public class N18_TrimToSizeCapacity<T> {
    private final List<T> list;

    public N18_TrimToSizeCapacity(List<T> list) {
        this.list = list;
    }

    public List<T> trimToSizeArrayList(List<T> listOfLetter) {
        new ArrayList<>(listOfLetter).trimToSize();
        return list;
    }
}