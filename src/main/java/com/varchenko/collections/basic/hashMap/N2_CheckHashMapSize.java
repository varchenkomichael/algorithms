package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;

import java.util.Map;

public class N2_CheckHashMapSize {
    private Map<User, String> map;

    public N2_CheckHashMapSize(Map<User, String> map) {
        this.map = map;
    }
    public int checkSizeOfHashMap(){
        return map.size();
    }
}
