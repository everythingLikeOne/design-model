/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.factory.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.factory.service
 * @ClassName: Factory
 * @Author shanqi
 * @Date: 2020/1/3 11:05
 */
public abstract class Factory {

    /**
     * 创建产品的完整过程
     *
     * @param owner
     * @return
     */
    public final Prodcut create(String owner) {
        Prodcut prodcut = createProdcut(owner);
        registerProduct(prodcut);
        return prodcut;
    }

    /**
     * 创建产品
     *
     * @param owner
     * @return
     */
    public abstract Prodcut createProdcut(String owner);

    /**
     * 注册产品
     *
     * @param prodcut
     */
    public abstract void registerProduct(Prodcut prodcut);
}
