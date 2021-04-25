package com.varchenko.collections.basic.hashMap;

import java.util.HashMap;

public class N6_CloneHashMap {
    private HashMap<User, String> hashMap;

    public N6_CloneHashMap(HashMap<User, String> hashMap) {
        this.hashMap = hashMap;
    }

    public HashMap<User, String> cloneMap(HashMap<User, String> mapTocClone) {
        hashMap = (HashMap<User, String>) mapTocClone.clone();
        return hashMap;
    }
}
