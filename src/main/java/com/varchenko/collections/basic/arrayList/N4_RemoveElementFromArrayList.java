package com.varchenko.collections.basic.arrayList;

import java.util.List;

public class N4_RemoveElementFromArrayList<T> {
    private List<T> list;

    public N4_RemoveElementFromArrayList(List<T> list) {
        this.list = list;
    }

    public void removeElement(T color) {
        list.remove(color);
    }
}
