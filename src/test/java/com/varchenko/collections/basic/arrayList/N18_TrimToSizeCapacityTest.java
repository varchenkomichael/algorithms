package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N18_TrimToSizeCapacityTest {
    @Test
    void trimToSize() {
        List<String> helpList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        N18_TrimToSizeCapacity<String> n18_trimToSizeCapacity = new N18_TrimToSizeCapacity<>(helpList);
        List<String> result = n18_trimToSizeCapacity.trimToSizeArrayList(helpList);
        assertEquals(helpList, result);
    }

}