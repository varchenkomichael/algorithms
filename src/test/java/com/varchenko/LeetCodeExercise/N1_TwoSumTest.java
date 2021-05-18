package com.varchenko.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class N1_TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = {1, 2, 5, 120, 13, 4};
        int target = 6;
        N1_TwoSum n1_twoSum = new N1_TwoSum();
        int[] result = n1_twoSum.twoSum(nums, target);
        int[] expectedResult = new int[] {0, 2};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }
}