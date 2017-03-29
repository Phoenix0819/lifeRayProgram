package com.liferay.tax.factory;

import com.liferay.tax.model.Items;
import com.liferay.tax.servive.GoodsService;

/**
 * Created by lenovo on 2017-03-29.
 */
public class GoodsFactory {
    public static Items generateGoods(String input){
        return GoodsService.goodsObj(input);
    }
}
