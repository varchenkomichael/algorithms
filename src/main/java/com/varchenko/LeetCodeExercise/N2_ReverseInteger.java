package com.varchenko.LeetCodeExercise;

public class N2_ReverseInteger {
    public int reverseInteger(int x) {
        int reverseInt = 0;
        while (x != 0 ) {
            int lastChar = x % 10;
            reverseInt = reverseInt * 10 + lastChar;
            x /= 10;
        }
        return reverseInt;
    }
}
