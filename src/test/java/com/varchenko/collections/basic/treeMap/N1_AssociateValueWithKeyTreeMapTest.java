package com.varchenko.collections.basic.treeMap;

import static org.junit.jupiter.api.Assertions.*;

import com.varchenko.collections.basic.User;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

class N1_AssociateValueWithKeyTreeMapTest {

    @Test
    void associateValueWithKey() {
        Map<User, String> result = new TreeMap<>();
        User userOne = new User(13, "Will", "Male");
        N1_AssociateValueWithKeyTreeMap n1_associateValueWithKeyTreeMap = new N1_AssociateValueWithKeyTreeMap(result);
        n1_associateValueWithKeyTreeMap.associateValueWithKey(userOne, userOne.toString());
        TreeMap<User, String> expectedResult = new TreeMap<>();
        expectedResult.put(userOne, userOne.toString());
        assertEquals(expectedResult, result);
    }
}