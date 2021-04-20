package com.varchenko.collections.basic.arrayList;

import java.util.List;

public class N14_JoinTwoArrayList<T> {
    private List<T> list;

    public N14_JoinTwoArrayList(List<T> list) {
        this.list = list;
    }
    public List<T> joinTwoArrayList(List<T> listOfColor){
        list.addAll(listOfColor);
        return list;
    }
}
