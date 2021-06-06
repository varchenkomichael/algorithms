package com.varchenko.collections.basic.treeMap;

import com.varchenko.collections.basic.User;

import java.util.Map;

public class N1_AssociateValueWithKeyTreeMap {
    private final Map<User, String> map;

    public N1_AssociateValueWithKeyTreeMap(Map<User, String> map) {
        this.map = map;
    }

    public Map<User, String> associateValueWithKey(User key, String value) {

        map.put(key, value);
        return map;
    }
}
