package com.varchenko.collections.basic.hashMap;

import com.varchenko.collections.basic.User;

import java.util.HashMap;

public class N8_CheckIsValueExist {
    private HashMap<User, String> hashMap;

    public N8_CheckIsValueExist(HashMap<User, String> hashMap) {
        this.hashMap = hashMap;
    }
    public Boolean checkIsValueExist(String str){
        return hashMap.containsValue(str);
    }
}
