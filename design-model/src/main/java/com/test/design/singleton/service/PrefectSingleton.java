/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.singleton.service;

import java.io.Serializable;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.singleton.service
 * @ClassName: PrefectSingleton
 * @Author shanqi
 * @Date: 2020/1/6 16:05
 * 按照破坏单例模式的三种方式（反射、序列化、克隆）对单例进行加强版改造
 * 解决方案如下：
 * <p>
 * 1、防止反射
 * <p>
 * 定义一个全局变量，当第二次创建的时候抛出异常
 * <p>
 * 2、防止克隆破坏
 * <p>
 * 重写clone(),直接返回单例对象
 * <p>
 * 3、防止序列化破坏
 * <p>
 * 添加readResolve(),返回Object对象
 */
public class PrefectSingleton implements Serializable, Cloneable {

    /**
     * 默认是第一次创建
     */
    private static volatile boolean isCreate = false;
    /**
     * 本类内部创建对象实例
     */
    private static volatile PrefectSingleton instance;

    /**
     * 构造方法私有化，外部不能new
     */
    private PrefectSingleton() {
        if (isCreate) {
            throw new RuntimeException("已然被实例化一次，不能在实例化");
        }
        System.out.println("生成一个加强版单例模式");
        isCreate = true;
    }

    /**
     * 提供一个公有的静态方法，返回实例对象
     *
     * @return
     */
    public static PrefectSingleton getInstance() {
        if (instance == null) {
            synchronized (PrefectSingleton.class) {
                if (instance == null) {
                    instance = new PrefectSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public Object clone() {
        return instance;
    }

    /**
     * 防止序列化破环
     *
     * @return
     */
    private Object readResolve() {
        return instance;
    }

}
