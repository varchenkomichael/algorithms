package com.varchenko.LeetCodeExercise;

public class N1_TwoSum {

    public int[] twoSum (int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums[j]; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}
