package com.liferay.tax;


import com.liferay.tax.factory.GoodsFactory;
import com.liferay.tax.model.Goods;
import com.liferay.tax.model.GoodsList;
import com.liferay.tax.model.Items;
import com.liferay.tax.util.PrintUtil;

import java.util.Scanner;

/**
 * Created by lenovo on 2017-03-27.
 */
public class TaxMain {
    public static void main(String [] args){
        System.out.println("Input:");
        GoodsList goodsList=new GoodsList();
        Scanner scanner=new Scanner(System.in);
        int count=0;
        do {
            String input=scanner.nextLine().trim();

            if (input.equals("")||input==null) {
                break;
            }else {
                count++;
                Items items= GoodsFactory.generateGoods(input);
               // Goods goods= GoodsGenerate.goodsObj(input);
                //遍历拆分成Goods对象
                //放入goodsMap
                Goods goods= (Goods) items.attributeReturn();
                goodsList.addGoods(count, goods);
                goodsList.setTaxNum(goodsList.getTaxNum().add(goods.getTaxPaid()));
                goodsList.setPriceNum(goodsList.getPriceNum().add(goods.getAfterTaxPrice()));
            }
        } while (true);

        PrintUtil.outPrint(goodsList);
    }



    /*CODING PROBLEM: TAX

                * Basic tax is applied at a rate of 10% on all goods except food and medical
        products.
                * Import tax is applied at a rate of 5% on all imported goods.
                * It is possible for both basic tax and import tax to be applied on a single
        product.

                Given a list of items, please generate a receipt. The receipt should include
        (1) the name of the items, (2) the final price of each item including tax, (3)
        The total amout of tax paid, and (4) the total amount.

                Examples

        Input 1:                                 Output 1:
        1 book at 12.49                          1 book: 13.74
        1 music CD at 14.99                      1 music CD: 16.49
        1 chocolate bar at 0.85                  1 chocolate bar: 0.85
        TAX: 2.75
        TOTAL: 31.08

        Input 2:                                 Output 2:
        1 imported box of chocolates at 10.00    1 imported box of chocolates: 10.50
        1 imported bottle of perfume at 47.50    1 imported bottle of perfume: 54.63
        TAX: 7.63
        TOTAL: 65.13

        Input 3:                                 Output 3:
        1 imported bottle of perfume at 27.99    1 imported bottle of perfume: 32.19
        1 bottle of perfume at 18.99             1 bottle of perfume: 20.89
        1 packet of headache pills at 9.75       1 packet of headache pills: 9.75
        1 imported box of chocolates at 11.25    1 imported box of chocolates: 11.81
        TAX: 6.66
        TOTAL: 74.64*/


}
