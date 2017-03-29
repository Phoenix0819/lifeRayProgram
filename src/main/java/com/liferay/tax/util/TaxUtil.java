package com.liferay.tax.util;

import com.liferay.tax.model.TaxPercent;

/**
 * Created by lenovo on 2017-03-28.
 */
public class TaxUtil {
    public static double basicTax(String kind) {
        return TaxPercent.getTaxPercentByKind(kind);
    }

    public static double importedTax(String[] strs) {
        double importedTax=0.00;
        for (String str:strs) {
            if (str.trim().equals("imported")){
                importedTax= TaxPercent.getTaxPercentByKind("imported");
                break;
            }
        }
        return importedTax;
    }
}
