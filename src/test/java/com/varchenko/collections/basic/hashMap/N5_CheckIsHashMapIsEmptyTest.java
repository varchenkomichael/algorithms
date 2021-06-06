package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N5_CheckIsHashMapIsEmptyTest {

    @Test
    void isEmptyHashMap() {
        User userOne = new User(12, "John", "Horse");
        HashMap<User, String> hashMap = new HashMap<>();
        hashMap.put(userOne, userOne.toString());
        N5_CheckIsHashMapIsEmpty n5_checkIsHashMapIsEmpty = new N5_CheckIsHashMapIsEmpty(hashMap);
        boolean result = n5_checkIsHashMapIsEmpty.isEmptyHashMap();
        assertFalse(result);
    }
}