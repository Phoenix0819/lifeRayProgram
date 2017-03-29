package com.liferay.taxCount.pojo;


import com.liferay.taxCount.model.Goods;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017-03-28.
 */
public class GoodsList {
    private BigDecimal taxNum=BigDecimal.valueOf(0.00);
    private BigDecimal priceNum=BigDecimal.valueOf(0.00);
    private Map<Integer,Goods> goodsMap=new HashMap<>();

    public BigDecimal getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(BigDecimal taxNum) {
        this.taxNum = taxNum;
    }

    public BigDecimal getPriceNum() {
        return priceNum;
    }

    public void setPriceNum(BigDecimal priceNum) {
        this.priceNum = priceNum;
    }

    public void addGoods(Integer no,Goods goods) {
        this.goodsMap.put(no,goods);
    }

    public Map<Integer,Goods> getGoodsMap() {
       return  this.goodsMap;
    }

}
