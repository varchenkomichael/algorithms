package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class N4_RemoveAllElementsFromHashMapTest {

    @Test
    void clearAllElements() {
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        User userThree = new User(13, "Victor", "Gay");
        HashMap<User, String> hashMapToClear = new HashMap<>();
        hashMapToClear.put(userOne, userOne.toString());
        hashMapToClear.put(userTwo, userTwo.toString());
        hashMapToClear.put(userThree, userThree.toString());
        HashMap<User, String> expectedResult = new HashMap<>();
        N4_RemoveAllElementsFromHashMap n4_removeAllElementsFromHashMap = new N4_RemoveAllElementsFromHashMap(hashMapToClear);
        Map<User, String> result = n4_removeAllElementsFromHashMap.clearAllElements();
        assertEquals(expectedResult, result);
    }
}