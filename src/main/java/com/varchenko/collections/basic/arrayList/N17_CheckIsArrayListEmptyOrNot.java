package com.varchenko.collections.basic.arrayList;

import java.util.List;

public class N17_CheckIsArrayListEmptyOrNot<T> {
    List<T> list;

    public N17_CheckIsArrayListEmptyOrNot(List<T> list) {
        this.list = list;
    }

    public Boolean getEmptyOrNot(List<T> listOfColor) {
        boolean isEmpty = listOfColor.isEmpty();
        return isEmpty;
    }
}
