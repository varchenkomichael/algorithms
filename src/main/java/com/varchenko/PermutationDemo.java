package com.varchenko;
import java.util.Random;

public class PermutationDemo {
    private static Random random;

    public int[] shuffle(int[] array) {
        if (random == null) random = new Random();
        for (int i = array.length; i > 1; i--) {
            swap(array, i - 1, random.nextInt(i));
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}



