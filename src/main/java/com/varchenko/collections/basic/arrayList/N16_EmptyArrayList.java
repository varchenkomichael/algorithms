package com.varchenko.collections.basic.arrayList;

import java.util.List;

public class N16_EmptyArrayList<T> {
    private List<T> list;

    public N16_EmptyArrayList(List<T> list) {
        this.list = list;
    }

    public List<T> emptyArrayList(List<String> helpList) {
        list.removeAll(list);
        return list;
    }
}
