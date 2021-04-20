package com.varchenko.collections.basic.arrayList;


import java.util.List;

public class N6_SearchingElementOfArrayList<T> {
    private List<T> list;

    public N6_SearchingElementOfArrayList(List<T> list) {
        this.list = list;
    }

    public boolean searchElement(T color) {
        return list.contains(color);
    }
}

