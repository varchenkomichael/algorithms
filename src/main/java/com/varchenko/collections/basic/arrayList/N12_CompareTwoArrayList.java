package com.varchenko.collections.basic.arrayList;

import java.util.List;

public class N12_CompareTwoArrayList<T> {
    private List<T> list;

    public N12_CompareTwoArrayList(List<T> list) {
        this.list = list;
    }

    public Boolean compareTwoArrayLists(List<T> listOfColor) {
            return list.containsAll(listOfColor);
    }
}
