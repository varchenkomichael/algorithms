package com.varchenko.collections.basic.hashMap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class N11_CreateKeySetOfMappingsTest {

    @Test
    void getKeySet() {
        HashMap<User, String> hashMap = new HashMap<>();
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        hashMap.put(userOne, userOne.toString());
        hashMap.put(userTwo, userTwo.toString());
        N11_CreateKeySetOfMappings n11_createKeySetOfMappings = new N11_CreateKeySetOfMappings(hashMap);
        Set result = n11_createKeySetOfMappings.getKeySet();
        Set expectedResult = hashMap.keySet();
        assertEquals(expectedResult, result);
    }
}