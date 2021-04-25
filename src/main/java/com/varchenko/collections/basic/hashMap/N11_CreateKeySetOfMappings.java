package com.varchenko.collections.basic.hashMap;

import java.util.HashMap;
import java.util.Set;

public class N11_CreateKeySetOfMappings {
    private final HashMap<User, String> hashMap;

    public N11_CreateKeySetOfMappings(HashMap<User, String> hashMap) {
        this.hashMap = hashMap;
    }
    public Set getKeySet(){
        return hashMap.keySet();
    }
}
