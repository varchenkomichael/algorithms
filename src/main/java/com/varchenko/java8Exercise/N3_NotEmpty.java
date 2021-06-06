package com.varchenko.java8Exercise;

import java.util.function.Predicate;

public class N3_NotEmpty {
    public boolean notEmpty(String str){
        Predicate<String> stringPredicate = s -> s.length() > 0;
        return stringPredicate.test(str);
    }
}
