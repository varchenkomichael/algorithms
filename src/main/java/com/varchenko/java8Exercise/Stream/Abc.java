package com.varchenko.java8Exercise.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Abc {
    public Map<Object, List<C>> compose() {
        A a1 = new A(1);
        A a2 = new A(2);
        A a3 = new A(3);

        B b1 = new B(1).add(a1).add(a2);
        B b2 = new B(2).add(a3).add(a2);

        C c1 = new C(1).add(b1).add(b2);
        C c2 = new C(2).add(b2);

        List<C> composition = Arrays.asList(c1, c2);

        Map<Object, List<C>> result = composition.stream()
                .collect(Collectors.groupingBy(C -> c1.getChildren()));
        return result;
    }
}
