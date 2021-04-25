package com.varchenko.collections.basic.hashMap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N10_GetValueByKeyTest {

    @Test
    void getValue() {
        HashMap<User, String> hashMap = new HashMap<>();
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        hashMap.put(userOne, userOne.getName());
        hashMap.put(userTwo, userTwo.getGender());
        N10_GetValueByKey n10_getValueByKey = new N10_GetValueByKey(hashMap);
        String result1 = n10_getValueByKey.getValue(userOne);
        String result2 = n10_getValueByKey.getValue(userTwo);
        assertEquals("John", result1);
        assertEquals("AlphaRussian", result2);
    }
}