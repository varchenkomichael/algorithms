package com.varchenko.collections.basic.hashMap;

import java.util.Collection;
import java.util.HashMap;

public class N12_GetValuesOfHashMap {
    private final HashMap<User, String> hashMap;

    public N12_GetValuesOfHashMap(HashMap<User, String> hashMap) {
        this.hashMap = hashMap;
    }
    public Collection<String> getValuesOfHashMap(){
        return hashMap.values();
    }
}
