package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class N3_JoinTwoHashMapsTest {

    @Test
    void joinTwoHasMaps() {
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        User userThree = new User(13, "Victor", "Gay");
        User userFour = new User(35, "Alena", "Female");
        HashMap<User, String> hashMapToAdd = new HashMap<>();
        HashMap<User, String> addingHashMap = new HashMap<>();
        hashMapToAdd.put(userOne, userOne.toString());
        hashMapToAdd.put(userTwo, userTwo.toString());
        addingHashMap.put(userThree, userThree.toString());
        addingHashMap.put(userFour, userFour.toString());
        N3_JoinTwoHashMaps joinTwoHashMaps = new N3_JoinTwoHashMaps(hashMapToAdd);
        HashMap<User, String> result = joinTwoHashMaps.joinTwoHasMaps(addingHashMap);
        HashMap<User, String> expectedResult = new HashMap<>();
        expectedResult.put(userOne, userOne.toString());
        expectedResult.put(userTwo, userTwo.toString());
        expectedResult.put(userThree, userThree.toString());
        expectedResult.put(userFour, userFour.toString());
        assertEquals(expectedResult, result);
    }
}