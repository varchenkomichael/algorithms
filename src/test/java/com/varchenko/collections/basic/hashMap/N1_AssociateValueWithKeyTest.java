package com.varchenko.collections.basic.hashMap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N1_AssociateValueWithKeyTest {
    @Test
    void valueWithKey() {
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        HashMap<User, String> result = new HashMap<>();
        N1_AssociateValueWithKey associateValueWithKey = new N1_AssociateValueWithKey(result);
        associateValueWithKey.associateValueWithKey(userOne, userOne.toString());
        associateValueWithKey.associateValueWithKey(userTwo, userTwo.toString());
        HashMap<User, String> expectedResult = new HashMap<>();
        expectedResult.put(userOne, userOne.toString());
        expectedResult.put(userTwo, userTwo.toString());
        assertEquals(expectedResult, result);
    }
}