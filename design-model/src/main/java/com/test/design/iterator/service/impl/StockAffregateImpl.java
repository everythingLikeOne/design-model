/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.iterator.service.impl;

import com.test.design.iterator.model.Merchandise;
import com.test.design.iterator.service.Affregate;
import com.test.design.iterator.service.Iterator;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.iterator.service.impl
 * @ClassName: StockAffregateImpl
 * @Author shanqi
 * @Date: 2019/12/26 14:36
 * 货道集合的实现，货道的属性：商品、容量；货道的行为：添加商品、获取商品、获取容量
 */
public class StockAffregateImpl implements Affregate {

    private Merchandise[] merchandises;
    private int size = 0;

    /**
     * 通过构造函数确定货道容量的大小
     *
     * @param maxSize 货道容量
     */
    public StockAffregateImpl(int maxSize) {
        this.merchandises = new Merchandise[maxSize];
    }

    /**
     * 添加商品
     *
     * @param merchandise
     */
    public void appendMerchandise(Merchandise merchandise) {
        this.merchandises[size++] = merchandise;
    }

    /**
     * 获取商品
     *
     * @param index
     * @return
     */
    public Merchandise getMerchandise(int index) {
        return merchandises[index];
    }

    /**
     * 获取目前的已存放商品的容量
     *
     * @return
     */
    public int getCurrentSize() {
        return this.size;
    }

    @Override
    public Iterator iterator() {
        return new StockIteratorImpl(this);
    }
}
