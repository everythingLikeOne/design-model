/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.singleton.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.singleton.service
 * @ClassName: InnerClassSingleton
 * @Author shanqi
 * @Date: 2020/1/6 14:09
 * 懒汉模式加载，按需加载、线程安全
 */
public class InnerClassSingleton {

    private static class SingletonHoler {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    /**
     * 构造方法私有化，外部不能new
     */
    private InnerClassSingleton() {
        System.out.println("生成一个静态内部类的实例");
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHoler.instance;
    }

}
