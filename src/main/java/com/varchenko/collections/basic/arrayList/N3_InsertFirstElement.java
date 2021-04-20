package com.varchenko.collections.basic.arrayList;

import java.util.List;

public class N3_InsertFirstElement<T> {
    private List<T> list;


    public N3_InsertFirstElement(List<T> list) {
    this.list = list;
    }

    public List<T> insertFirstElement(T color){
    list.add(0, color);
    return list;
    }
}
