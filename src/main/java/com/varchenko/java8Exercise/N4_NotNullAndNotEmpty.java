package com.varchenko.java8Exercise;

import java.util.Objects;
import java.util.function.Predicate;

public class N4_NotNullAndNotEmpty {
    public boolean notEmptyAndNotNull(String str) {
        Predicate<String> notEmpty = s -> s.length() > 0;
        Predicate<String> notNull = Objects::nonNull;
        return notEmpty.and(notNull).test(str);
    }
}
