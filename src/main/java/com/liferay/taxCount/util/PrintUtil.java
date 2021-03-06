package com.liferay.taxCount.util;


import com.liferay.taxCount.model.Goods;
import com.liferay.taxCount.pojo.GoodsList;

import java.math.RoundingMode;

/**
 * Created by lenovo on 2017-03-29.
 */
public class PrintUtil {
    public static void outPrint(GoodsList goodsList) {
        System.out.println("=============================");
        System.out.println("Output:");
        for (Goods goods: goodsList.getGoodsMap().values()) {
           goods.printGoods();
        }
        System.out.println("TAX:"+goodsList.getTaxNum().setScale(2,RoundingMode.HALF_EVEN));
        System.out.println("TOTAL:"+goodsList.getPriceNum().setScale(2,RoundingMode.HALF_EVEN));
    }
}
