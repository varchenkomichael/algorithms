package com.varchenko.collections.basic.arrayList;

import java.util.List;

public class N11_ExtractAPortionOfArrayList<T> {
    private List<T> list;

    public N11_ExtractAPortionOfArrayList(List<T> list) {
        this.list = list;
    }

    public List<T> extractAPortion(int fromIndex, int toIndex) {
        List<T> sub_List = list.subList(fromIndex, toIndex);
        return sub_List;
    }
}
