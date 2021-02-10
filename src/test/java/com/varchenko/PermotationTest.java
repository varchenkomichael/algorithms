package com.varchenko;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PermotationTest {
    PermutationDemo permutationDemo = new PermutationDemo();

    @Test
    void Permotation_2number() {
        for (int i = 0; i < 6; i++) {
            int[] array = {1, 2};
            if (array[i] == 2) {
                int[] expectedResult = {2, 1};
                int[] result = permutationDemo.shuffle(array);
                System.out.println(Arrays.toString(array));
                assertArrayEquals(expectedResult, result);
            }
        }
    }
    @Test
    void Permotation_3Number(){

    }
}
