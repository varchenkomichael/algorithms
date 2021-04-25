package com.varchenko.collections.basic.hashMap;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N12_GetValuesOfHashMapTest {

    @Test
    void getValuesOfHashMap() {
        HashMap<User, String> hashMap = new HashMap<>();
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        hashMap.put(userOne, userOne.getName());
        hashMap.put(userTwo, userTwo.getName());
        N12_GetValuesOfHashMap n12_getValuesOfHashMap = new N12_GetValuesOfHashMap(hashMap);
        Collection<String> result = n12_getValuesOfHashMap.getValuesOfHashMap();
        Collection<String> expectedResult = hashMap.values();
        assertEquals(expectedResult, result);
    }
}