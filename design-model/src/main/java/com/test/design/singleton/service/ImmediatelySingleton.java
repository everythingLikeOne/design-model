/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.singleton.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.immediatelySingleton.service
 * @ClassName: ImmediatelySingleton
 * @Author shanqi
 * @Date: 2020/1/3 18:13
 * 生成一个饿汉式的实例,立即加载
 */
public class ImmediatelySingleton {
    private static ImmediatelySingleton immediatelySingleton = new ImmediatelySingleton();

    /**
     * 构造方法私有化，外部不能new
     */
    private ImmediatelySingleton() {
        System.out.println("生成一个饿汉式的实例");
    }

    public static ImmediatelySingleton getInstance() {
        return immediatelySingleton;
    }

}
