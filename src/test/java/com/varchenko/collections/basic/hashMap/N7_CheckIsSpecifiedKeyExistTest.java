package com.varchenko.collections.basic.hashMap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N7_CheckIsSpecifiedKeyExistTest {

    @Test
    void checkIsKeyExist() {
        HashMap<User, String> hashMap = new HashMap<>();
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        User userThree = new User(13, "Victor", "Gay");
        hashMap.put(userOne, userOne.toString());
        hashMap.put(userTwo, userTwo.toString());
        N7_CheckIsSpecifiedKeyExist n7_checkIsSpecifiedKeyExist = new N7_CheckIsSpecifiedKeyExist(hashMap);
        boolean result = n7_checkIsSpecifiedKeyExist.checkIsKeyExist(userOne);
        boolean falseResult = n7_checkIsSpecifiedKeyExist.checkIsKeyExist(userThree);
        assertFalse(falseResult);
        assertTrue(result);
    }
}