/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.iterator.service.impl;

import com.test.design.iterator.model.Merchandise;
import com.test.design.iterator.service.Iterator;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.iterator.service.impl
 * @ClassName: StockIteratorImpl
 * @Author shanqi
 * @Date: 2019/12/26 14:02
 * 数组遍历的具体实现（货道放商品遍历的实现）
 */
public class StockIteratorImpl implements Iterator {
    private StockAffregateImpl stockAffregateImpl;
    private int index = 0;

    public StockIteratorImpl(StockAffregateImpl stockAffregateImpl) {
        this.stockAffregateImpl = stockAffregateImpl;
    }

    @Override
    public boolean hasNext() {
        return index < stockAffregateImpl.getCurrentSize();
    }

    @Override
    public Object next() {
        Merchandise merchandise = stockAffregateImpl.getMerchandise(index);
        index++;
        return merchandise;
    }
}
