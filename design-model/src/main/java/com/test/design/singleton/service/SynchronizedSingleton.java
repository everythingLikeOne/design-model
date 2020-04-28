/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.singleton.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.immediatelySingleton.service
 * @ClassName: SynchronizedSingleton
 * @Author shanqi
 * @Date: 2020/1/3 18:01
 * 懒汉式 按需加载 线程安全，双重检查锁 DCL（double-checked locking）+ volatile
 */
public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton synchronizedSingleton = null;

    /**
     * 构造方法私有化，外部不能new
     */
    private SynchronizedSingleton() {
        System.out.println("生成一个懒汉式的线程安全的实例");
    }

    public static SynchronizedSingleton getInstance() {
        if (synchronizedSingleton == null) {
            synchronized (SynchronizedSingleton.class) {
                if (synchronizedSingleton == null) {
                    synchronizedSingleton = new SynchronizedSingleton();
                }
            }
        }
        return synchronizedSingleton;
    }
}
