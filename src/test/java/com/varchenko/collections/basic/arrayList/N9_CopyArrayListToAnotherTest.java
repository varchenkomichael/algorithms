package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N9_CopyArrayListToAnotherTest {
    @Test
    void copyArrayListToAnother() {
        N9_CopyArrayListToAnother<String> instance = this.getInstanceForTests();
        List<String> arrayToCopy = List.of("Red", "Blue", "Green", "Pink", "Black");
        List<String> expectedResult = List.of("Red", "Blue", "Green", "Pink", "Black");
        List<String> result = instance.copyArrayList(arrayToCopy);
        assertEquals(expectedResult, result);
    }

    private N9_CopyArrayListToAnother<String> getInstanceForTests() {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        return new N9_CopyArrayListToAnother<>(list);
    }
}