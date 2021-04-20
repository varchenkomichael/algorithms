package com.varchenko.collections.basic.arrayList;

import java.util.Collections;
import java.util.List;

public class N9_CopyArrayListToAnother<T> {
    private List<T> list;

    public N9_CopyArrayListToAnother(List<T> list) {
        this.list = list;
    }

    public List<T> copyArrayList(List<T> listOfColors) {
        Collections.copy(list, listOfColors);
        return list;
    }
}
