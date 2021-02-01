package com.varchenko;

public class BubbleSort {
    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort == null) return new int[] {};

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = 0; j < arrayToSort.length - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int tmp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = tmp;
                }
            }
        }
        return arrayToSort;
    }
}
