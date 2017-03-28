package com.liferay.util;

import com.liferay.model.Goods;
import com.liferay.model.KindMap;
import com.liferay.model.TaxPercent;

import java.math.BigDecimal;

import static com.liferay.util.TaxCount.basicTax;
import static com.liferay.util.TaxCount.importedTax;

/**
 * Created by lenovo on 2017-03-28.
 */
public class GoodsGenerate {
    public static Goods goodsObj(String input) {
        Goods goods=new Goods();
        String [] strAt=input.split("\\s+at");
        goods.setPrintName(strAt[0].trim()+":");
        goods.setBeforeTaxPrice(BigDecimal.valueOf(Double.valueOf(strAt[1].trim())));

        String[] strs=strAt[0].split("\\s+");
        goods.setName(strs[strs.length-1]);
        goods.setKind(KindMap.getKindByName(goods.getName()));
        goods.setTaxPercent(new BigDecimal(importedTax(strs)+basicTax(goods.getKind())));

        //计算taxPaid
        BigDecimal taxPaid=taxPaidCount(goods);
        goods.setTaxPaid(taxPaid);
        goods.setAfterTaxPrice(goods.getBeforeTaxPrice().add(taxPaid));
        //加入总税费，总价格

        return goods;
    }

    //计算taxPaid
    private static BigDecimal taxPaidCount(Goods goods) {
        BigDecimal taxPercent=goods.getTaxPercent();
        BigDecimal taxPaid=taxPercent;
        taxPaid=taxPaid.multiply(goods.getBeforeTaxPrice());
        return taxPaid;
    }

    //得到税点
    private static double taxPercentByKind(String kind) {
        return TaxPercent.getTaxPercentByKind(kind);
    }

}
