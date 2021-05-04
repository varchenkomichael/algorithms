package com.varchenko.collections.basic.treeMap;

import com.varchenko.collections.basic.User;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N3_SortTreeMapUsingComparatorTest {

    @Test
    void sortTreeMap() {
        Map<User, String> map = new TreeMap<>();
        User userA = new User(12, "Victor", "Male");
        User userB = new User(14, "Andrey", "Male");
        User userC = new User(18, "Hole", "Female");
        map.put(userA, userA.getName());
        map.put(userB, userB.getName());
        map.put(userC, userC.getName());
        N3_SortTreeMapUsingComparator n3_sortTreeMapUsingComparator = new N3_SortTreeMapUsingComparator(map);
        TreeMap<User, String> result = (TreeMap<User, String>) n3_sortTreeMapUsingComparator.getMap();
        result.
        assertEquals();
    }
}