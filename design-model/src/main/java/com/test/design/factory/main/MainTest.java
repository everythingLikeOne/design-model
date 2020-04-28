/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.factory.main;

import com.test.design.factory.service.Factory;
import com.test.design.factory.service.Prodcut;
import com.test.design.factory.service.impl.IDCardFactory;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.factory.main
 * @ClassName: MainTest
 * @Author shanqi
 * @Date: 2020/01/03 11:29
 */
public class MainTest {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Prodcut product = factory.create("小明");
        product.use();

    }
}
