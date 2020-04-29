/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.factory.service.impl;

import com.test.design.factory.service.Factory;
import com.test.design.factory.service.Prodcut;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.factory.service.impl
 * @ClassName: IDCardFactory
 * @Author shanqi
 * @Date: 2020/1/3 11:18
 */
public class IDCardFactory extends Factory {
    /**
     * ID卡注册地方
     */
    private List<String> list = new ArrayList<>();

    @Override
    public Prodcut createProdcut(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Prodcut prodcut) {
        list.add(((IDCard) prodcut).getOwner());
    }
}
