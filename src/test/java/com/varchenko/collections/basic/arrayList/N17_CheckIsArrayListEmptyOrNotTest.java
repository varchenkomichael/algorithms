package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N17_CheckIsArrayListEmptyOrNotTest {
    @Test
    void checkIsArrayNotEmpty() {
        List<String> notEmptyList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Pink", "Black"));
        N17_CheckIsArrayListEmptyOrNot<String> n17_checkIsArrayListEmptyOrNot = new N17_CheckIsArrayListEmptyOrNot<>(notEmptyList);
        boolean result = n17_checkIsArrayListEmptyOrNot.getEmptyOrNot(notEmptyList);
        assertFalse(result);
    }
    @Test
    void checkIsArrayEmpty() {
        List<String> emptyList = new ArrayList<>();
        N17_CheckIsArrayListEmptyOrNot<String> n17_checkIsArrayListEmptyOrNot = new N17_CheckIsArrayListEmptyOrNot<>(emptyList);
        boolean result = n17_checkIsArrayListEmptyOrNot.getEmptyOrNot(emptyList);
        assertTrue(result);
    }

}