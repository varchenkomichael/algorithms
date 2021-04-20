package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.List;

public class N18_TrimToSizeCapacity<T> {

    public List<T> trimToSizeArrayList(List<T> listOfLetter) {
        new ArrayList<>(listOfLetter).trimToSize();
        return listOfLetter;
    }
}