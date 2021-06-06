package com.varchenko.java8Exercise;

import java.util.Objects;
import java.util.function.Predicate;

public class N2_NotNull {
    public boolean notNull(String str) {
        Predicate<String> notNull = Objects::nonNull;
        return notNull.test(str);
    }
}
