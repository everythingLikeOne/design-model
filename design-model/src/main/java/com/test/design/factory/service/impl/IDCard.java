/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.factory.service.impl;

import com.test.design.factory.service.Prodcut;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.factory.service.impl
 * @ClassName: IDCard
 * @Author shanqi
 * @Date: 2020/1/3 11:14
 */
public class IDCard extends Prodcut {

    private String owner;

    /**
     * 制作（构造）一个ID卡
     *
     * @param owner
     */
    public IDCard(String owner) {
        System.out.println("制作" + owner + "ID卡");
        this.owner = owner;
    }

    /**
     * 使用ID卡
     */
    @Override
    public void use() {
        System.out.println("使用" + owner + "ID卡");
    }

    /**
     * 获取I卡
     *
     * @return
     */
    public String getOwner() {
        return owner;
    }
}
