package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class N18_TrimToSizeCapacityTest {
    @Test
    void trimToSize() throws Exception {
        List<String> helpList = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        N18_TrimToSizeCapacity<String> n18_trimToSizeCapacity = new N18_TrimToSizeCapacity<>();
        List<String> sizeResult = n18_trimToSizeCapacity.trimToSizeArrayList(helpList);
        int result =  getCapacity(helpList);
        int expectedResult = sizeResult.size();
        assertEquals(expectedResult, result);
    }
    static int getCapacity(List<String> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}