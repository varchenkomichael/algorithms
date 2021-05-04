package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;

import java.util.HashMap;

public class N3_JoinTwoHashMaps {
    private HashMap<User, String> hashMap;

    public N3_JoinTwoHashMaps(HashMap<User, String> hashMap) {
        this.hashMap = hashMap;
    }
    public HashMap<User, String> joinTwoHasMaps(HashMap<User, String> joinMap){
        hashMap.putAll(joinMap);
        return hashMap;
    }
}
