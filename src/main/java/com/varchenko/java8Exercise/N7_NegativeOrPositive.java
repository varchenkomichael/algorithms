package com.varchenko.java8Exercise;

import java.util.function.Function;

public class N7_NegativeOrPositive {
    public String positiveOrNegativeOrNull(int n){
        Function<Integer, String> positiveOrNegativeOrNull = integer -> String.valueOf((integer.compareTo(0)));
         return positiveOrNegativeOrNull.apply(n);
    }
}
