package com.varchenko.collections.basic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CopyArrayListToAnother<T> {
    public final ArrayList<T> addElements(ArrayList<T> list, T... elements) {
        list.addAll(Arrays.asList(elements));
        return list;
    }

        public void copyArrayList (ArrayList<String> listOfColors) {
            ArrayList<String> listOfLetters = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
            Collections.copy(listOfLetters, listOfColors);
        }
    }
