/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.iterator.main;

import com.test.design.iterator.model.Merchandise;
import com.test.design.iterator.service.Iterator;
import com.test.design.iterator.service.impl.StockAffregateImpl;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.iterator.main
 * @ClassName: MainTest
 * @Author shanqi
 * @Date: 2019/12/26 15:23
 */
public class MainTest {

    public static void main(String[] args) {
        StockAffregateImpl stockAffregate = new StockAffregateImpl(10);
        stockAffregate.appendMerchandise(Merchandise.builder().id("1").mercName("雪碧").price(new Double("3.5")).build());
        stockAffregate.appendMerchandise(Merchandise.builder().id("2").mercName("可乐").price(new Double("3.5")).build());
        stockAffregate.appendMerchandise(Merchandise.builder().id("3").mercName("红牛").price(new Double("5")).build());
        Iterator iterator = stockAffregate.iterator();
        while (iterator.hasNext()) {
            Merchandise merc = (Merchandise) iterator.next();
            System.out.println(merc.toString());
        }

    }
}
