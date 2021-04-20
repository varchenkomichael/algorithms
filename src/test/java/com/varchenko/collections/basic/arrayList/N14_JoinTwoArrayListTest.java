package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N14_JoinTwoArrayListTest {
    @Test
    void joinTwoArrayList(){
        List<String> helpList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N14_JoinTwoArrayList<String> n14_joinTwoArrayList = new N14_JoinTwoArrayList<>(helpList);
        List<String> addList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> result = n14_joinTwoArrayList.joinTwoArrayList(addList);
        List<String> expectedResult = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black", "a", "b", "c"));
        assertEquals(expectedResult, result);
    }

}