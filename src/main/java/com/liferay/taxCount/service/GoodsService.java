package com.liferay.taxCount.service;

import com.liferay.taxCount.factory.GoodsFactory;
import com.liferay.taxCount.model.Goods;
import com.liferay.taxCount.pojo.GoodsList;
import java.util.Scanner;

/**
 * Created by lenovo on 2017-03-28.
 */
public class GoodsService {
    public static GoodsList goodsTaxStart(){
        GoodsList goodsList=new GoodsList();
        System.out.println("Input:");
        Scanner scanner=new Scanner(System.in);
        int count=0;
        do {
            String input=scanner.nextLine().trim();

            if (input.equals("")||input==null) {
                break;
            }else {
                count++;
                Goods goods=GoodsFactory.generateGoods(input);
                //遍历拆分成Goods对象
                //放入goodsMap
                goodsList.addGoods(count, goods);
                goodsList.setTaxNum(goodsList.getTaxNum().add(goods.getTaxPaid()));
                goodsList.setPriceNum(goodsList.getPriceNum().add(goods.getAfterTaxPrice()));
            }
        } while (true);
        return goodsList;
    }


}
