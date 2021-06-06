package com.varchenko.collections.basic.treeMap;

import com.varchenko.collections.basic.User;

import java.util.Map;

public class N2_JoinTwoTreeMaps {
    private final Map<User, String> map;

    public N2_JoinTwoTreeMaps(Map<User, String> map) {
        this.map = map;
    }

    public Map<User, String> joinTwoMap(Map<User, String> treeMapToJoin) {
        map.putAll(treeMapToJoin);
        return map;
    }
}
