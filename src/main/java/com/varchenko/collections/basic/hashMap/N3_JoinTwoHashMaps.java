package com.varchenko.collections.basic.hashMap;

import java.util.HashMap;
import java.util.Map;

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
