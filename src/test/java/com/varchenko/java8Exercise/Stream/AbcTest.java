package com.varchenko.java8Exercise.Stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class AbcTest {

    @Test
    void compose() {
        Abc abc = new Abc();
        Map<Object, List<C>> result = abc.compose();
        System.out.println(result);
    }
}