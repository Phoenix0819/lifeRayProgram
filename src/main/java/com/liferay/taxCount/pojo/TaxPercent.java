package com.liferay.taxCount.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017-03-29.
 */
public class TaxPercent {
    private static final Map<String,Double> taxPercent;
    static {
        taxPercent=new HashMap<String,Double>();
        taxPercent.put("basic",0.10);
        taxPercent.put("food",0.00);
        taxPercent.put("medical",0.00);
        taxPercent.put("imported",0.05);

    }
    public static double getTaxPercentByKind(String kind){
        return taxPercent.get(kind);
    }

}
