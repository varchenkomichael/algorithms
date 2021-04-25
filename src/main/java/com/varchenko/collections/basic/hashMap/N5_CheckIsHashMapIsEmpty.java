package com.varchenko.collections.basic.hashMap;

import java.util.Map;

public class N5_CheckIsHashMapIsEmpty {
    private Map<User, String> map;

    public N5_CheckIsHashMapIsEmpty(Map<User, String> map) {
        this.map = map;
    }
    public Boolean isEmptyHashMap(){
        return map.isEmpty();
    }
}
