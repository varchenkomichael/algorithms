package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;

import java.util.Map;

public class N10_GetValueByKey {
    private Map<User, String> map;

    public N10_GetValueByKey(Map<User, String> map) {
        this.map = map;
    }
    public String getValue(User key){
       return map.get(key);
    }
}
