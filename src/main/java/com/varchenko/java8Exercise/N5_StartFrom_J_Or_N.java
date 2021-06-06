package com.varchenko.java8Exercise;

import java.util.function.Predicate;

public class N5_StartFrom_J_Or_N {
    public boolean startFrom(String str) {
        Predicate<String> startFromN = s -> s.startsWith(str);
        Predicate<String> startFromJ = s -> s.startsWith(str);
        return startFromN.and(startFromJ).test(str);
    }

    public boolean startFrom2(String str, char n, char j) {
       return str.charAt(0) == n || str.charAt(0) == j;
    }
}
