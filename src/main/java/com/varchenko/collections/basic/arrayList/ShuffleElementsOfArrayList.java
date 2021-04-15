package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShuffleElementsOfArrayList<T> {
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }
    public void shuffleElement(ArrayList<T> shuffleList){
        Collections.shuffle(shuffleList);
    }
}
