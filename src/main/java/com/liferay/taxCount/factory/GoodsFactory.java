package com.liferay.taxCount.factory;

import com.liferay.taxCount.model.*;
import com.liferay.taxCount.pojo.KindMap;

import java.math.BigDecimal;
import static com.liferay.taxCount.util.TaxUtil.basicTax;
import static com.liferay.taxCount.util.TaxUtil.importedTax;


/**
 * Created by lenovo on 2017-03-29.
 */
public class GoodsFactory {
    public static Goods generateGoods(String input){
        String [] strAt=input.split("\\s+at");
        String[] strs=strAt[0].split("\\s+");
        String name=strs[strs.length-1];
        String kind= KindMap.getKindByName(name);
        Goods goods=generateKindGoods(name);

        goods.setPrintName(strAt[0].trim()+":");
        goods.setBeforeTaxPrice(BigDecimal.valueOf(Double.valueOf(strAt[1].trim())));
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

    private static Goods generateKindGoods(String name) {
        switch (name){
            case "book":
                return new Book();
            case "CD":
                return new CD();
            case "bar":
                return new Chocolate();
            case "chocolates":
                return new Chocolate();
            case "perfume":
               return new Perfume();
            case "pills":
               return new Pill();
            default:
                return new BasicGoods();
        }
    }


    //计算taxPaid
    private static BigDecimal taxPaidCount(com.liferay.taxCount.model.Goods goods) {

        return goods.getTaxPercent().multiply(goods.getBeforeTaxPrice());
    }
}
