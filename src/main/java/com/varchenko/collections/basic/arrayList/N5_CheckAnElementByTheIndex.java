package com.varchenko.collections.basic.arrayList;

import java.util.List;

public class N5_CheckAnElementByTheIndex<T> {
    private final List<T> list;

    public N5_CheckAnElementByTheIndex(List<T> list) {
        this.list = list;
    }
    public T checkElementByIndex(int index){
        return list.get(index);
    }
}

