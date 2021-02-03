package com.varchenko;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
class BubbleSortTest {
    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void sortArray_positiveNumbers() {
        int[] arrayToSort = {5, 2, 1, 10, 50, 10};
        int[] expectedResult = {1, 2, 5, 10, 10, 50};

        int[] result = bubbleSort.sortArray(arrayToSort);
System.out.println(Arrays.toString(arrayToSort));
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void sortArray_negativeNumbers() {
        int[] arrayToSort = {-5, 2, 1, -10, 50, -1000000000};
        int[] expectedResult = {-1000000000, -10, -5, 1, 2, 50};

        int[] result = bubbleSort.sortArray(arrayToSort);

        assertArrayEquals(expectedResult, result);
    }
}
