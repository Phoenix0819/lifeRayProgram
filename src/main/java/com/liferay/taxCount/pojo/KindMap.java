package com.liferay.taxCount.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017-03-28.
 */
public class KindMap {
    private static final Map<String,String> kindMap;

    static {
        kindMap=new HashMap<>();
        kindMap.put("book","basic");
        kindMap.put("CD","basic");
        kindMap.put("bar","food");
        kindMap.put("chocolates","food");
        kindMap.put("perfume","basic");
        kindMap.put("pills","medical");
    }
    public static String getKindByName(String name){
        return kindMap.get(name);
    }
}
