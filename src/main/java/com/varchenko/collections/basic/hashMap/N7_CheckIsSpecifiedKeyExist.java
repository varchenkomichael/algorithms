package com.varchenko.collections.basic.hashMap;

import java.util.HashMap;

public class N7_CheckIsSpecifiedKeyExist {
    private HashMap<User, String> hashMap;

    public N7_CheckIsSpecifiedKeyExist(HashMap<User, String> hashMap) {
        this.hashMap = hashMap;
    }
    public Boolean checkIsKeyExist(User user){
       return hashMap.containsKey(user);
    }
}
