package com.varchenko.LeetCodeExercise;

public class N2_ReverseInteger {
    public int reverseInteger(int x) {
        long reverseInt = 0;
        while (x != 0) {
            int lastChar = x % 10;
            reverseInt = reverseInt * 10 + lastChar;
            x /= 10;
      if (reverseInt > Integer.MAX_VALUE || reverseInt < Integer.MIN_VALUE){
          return 0;
      }
        }
        return (int) reverseInt;
    }
}
