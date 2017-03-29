package com.liferay.taxCount.model;

import java.math.RoundingMode;

/**
 * Created by lenovo on 2017-03-29.
 */
public class BasicGoods extends Goods{
    @Override
    public void printGoods() {
        System.out.println(this.getPrintName()+this.getAfterTaxPrice().setScale(2, RoundingMode.HALF_EVEN));
    }
}
