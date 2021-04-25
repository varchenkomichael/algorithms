package com.varchenko.collections.basic.hashMap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N6_CloneHashMapTest {

    @Test
    void cloneHashMap() {
        HashMap<User, String> hashMap = new HashMap<>();
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        hashMap.put(userOne, userOne.toString());
        hashMap.put(userTwo, userTwo.toString());
        N6_CloneHashMap n6_cloneHashMap = new N6_CloneHashMap(hashMap);
        HashMap<User, String> result = n6_cloneHashMap.cloneMap(hashMap);
        assertEquals(hashMap, result);
    }
}