package com.varchenko;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertSortTest {
    private final InsertSort insertSort = new InsertSort();

    @Test
    void sortArray_positiveNumbers() {
        int[] arr = {5, 2, 1, 10, 50, 10};
        int[] expectedResult = {1, 2, 5, 10, 10, 50};

        int[] result = insertSort.arr(arr) ;

        assertArrayEquals(expectedResult, result);
System.out.println(Arrays.toString(arr));
    }
}
