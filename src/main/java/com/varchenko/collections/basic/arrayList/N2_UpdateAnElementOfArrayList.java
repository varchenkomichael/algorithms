package com.varchenko.collections.basic.arrayList;


import java.util.List;

public class N2_UpdateAnElementOfArrayList<T> {
    private List<T> list;

    public N2_UpdateAnElementOfArrayList(List<T> list) {
        this.list = list;
    }

    public List<T> updateElement(T colorToUpdate, int index) {
        list.set(index, colorToUpdate);
        return list;
    }
}

