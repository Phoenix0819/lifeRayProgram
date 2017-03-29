package com.liferay.tax.servive;

import com.liferay.tax.model.Goods;
import com.liferay.tax.model.KindMap;
import java.math.BigDecimal;

import static com.liferay.tax.util.TaxUtil.basicTax;
import static com.liferay.tax.util.TaxUtil.importedTax;

/**
 * Created by lenovo on 2017-03-28.
 */
public class GoodsService {
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

        return goods.getTaxPercent().multiply(goods.getBeforeTaxPrice());
    }

}
