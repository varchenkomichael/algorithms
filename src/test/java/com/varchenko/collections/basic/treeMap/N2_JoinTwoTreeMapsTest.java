package com.varchenko.collections.basic.treeMap;

import com.varchenko.collections.basic.User;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class N2_JoinTwoTreeMapsTest {

    @Test
    void getMap() {
        Map<User, String> treeMap = new TreeMap<>();
        User userOne = new User(12, "John", "Horse");
        User userTwo = new User(60, "Yuri", "AlphaRussian");
        treeMap.put(userOne, userOne.toString());
        treeMap.put(userTwo, userTwo.toString());
        N2_JoinTwoTreeMaps n2_joinTwoTreeMaps = new N2_JoinTwoTreeMaps(treeMap);
        Map<User, String> result = n2_joinTwoTreeMaps.joinTwoMap(treeMap);
        assertEquals(treeMap, result);
    }
}