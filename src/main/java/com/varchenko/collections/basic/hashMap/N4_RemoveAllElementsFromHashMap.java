package com.varchenko.collections.basic.hashMap;

import java.util.Map;

public class N4_RemoveAllElementsFromHashMap {
    private Map<User, String> map;

    public N4_RemoveAllElementsFromHashMap(Map<User, String> map) {
        this.map = map;
    }
    public Map<User, String> clearAllElements(){
        map.clear();
        return map;
    }
}
