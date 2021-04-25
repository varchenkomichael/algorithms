package com.varchenko.collections.basic.hashMap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N2_CheckHashMapSizeTest {

    @Test
    void checkSizeOfHashMap() {
        User userOne = new User(1, "Lena", "Female");
        User userTwo = new User(3, "Bon", "male");
        HashMap<User, String> hashMap = new HashMap<>();
        hashMap.put(userOne, userOne.toString());
        hashMap.put(userTwo, userTwo.toString());
        N2_CheckHashMapSize checkHashMapSize = new N2_CheckHashMapSize(hashMap);
        int result = checkHashMapSize.checkSizeOfHashMap();
        int expectedResult = hashMap.size();
        assertEquals(expectedResult, result);
    }
}