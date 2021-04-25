package com.varchenko.collections.basic.hashMap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class N9_CreateSetOfMappingsTest {

    @Test
    void createSetOfMappings() {
        HashMap<User, String> hashMap = new HashMap<>();
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        hashMap.put(userOne, userOne.getName());
        hashMap.put(userTwo, userTwo.getName());
        N9_CreateSetOfMappings n9_createSetOfMappings = new N9_CreateSetOfMappings(hashMap);
        Set result = n9_createSetOfMappings.createSetOfMappings();
        Set expectedResult = hashMap.entrySet();
        assertEquals(expectedResult, result);
    }
}