package com.varchenko.collections.basic.hashMap;

import java.util.Map;

public class N1_AssociateValueWithKey {
    private Map<User, String> map;

    public N1_AssociateValueWithKey(Map<User, String> map) {
        this.map = map;
    }

    public Map<User, String> associateValueWithKey(User key, String value) {
        map.put(key, value);
        return map;
    }
}
