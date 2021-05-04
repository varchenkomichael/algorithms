package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N8_CheckIsValueExistTest {

    @Test
    void checkIsValueExist() {
        HashMap<User, String> hashMap = new HashMap<>();
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        hashMap.put(userOne, userOne.getName());
        hashMap.put(userTwo, userTwo.getName());
        N8_CheckIsValueExist n8_checkIsValueExist = new N8_CheckIsValueExist(hashMap);
        boolean result = n8_checkIsValueExist.checkIsValueExist("John");
        boolean falseResult = n8_checkIsValueExist.checkIsValueExist("Hui");
        assertTrue(result);
        assertFalse(falseResult);
    }
}