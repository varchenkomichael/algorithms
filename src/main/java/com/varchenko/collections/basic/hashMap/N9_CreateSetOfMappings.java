package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;

import java.util.HashMap;
import java.util.Set;

public class N9_CreateSetOfMappings {
    private final HashMap<User, String> hashMap;

    public N9_CreateSetOfMappings(HashMap<User, String> hashMap) {
        this.hashMap = hashMap;
    }
    public Set createSetOfMappings(){
        return hashMap.entrySet();
    }
}
