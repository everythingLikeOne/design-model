/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.singleton.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.immediatelySingleton.service
 * @ClassName: SimpleSingleton
 * @Author shanqi
 * @Date: 2020/1/3 17:47
 * 懒汉式 按需加载
 */
public class SimpleSingleton {
    private static SimpleSingleton simpleSingleton = null;

    /**
     * 构造方法私有化，外部不能new
     */
    private SimpleSingleton() {
        System.out.println("生成一个懒汉式（按需加载）的实例");
    }

    public static SimpleSingleton getInstance() {
        if (simpleSingleton == null) {
            simpleSingleton = new SimpleSingleton();
        }
        return simpleSingleton;
    }

}
