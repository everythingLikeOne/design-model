/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.singleton.main;

import com.test.design.singleton.service.ImmediatelySingleton;
import com.test.design.singleton.service.InnerClassSingleton;
import com.test.design.singleton.service.SimpleSingleton;
import com.test.design.singleton.service.SynchronizedSingleton;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.singleton.main
 * @ClassName: TestThread
 * @Author shanqi
 * @Date: 2020/1/3 19:02
 */
public class TestThread extends Thread{
    @Override
    public void run(){
        /**
         * 1.饿汉式的实例（ImmediatelySingleton）
         */
//        createImmediatelySingletonThread();
        /**
         * 2.懒汉式 按需加载(线程安全测试)（SimpleSingleton）
         */
//        createSimpleSingletonThread();
        /**
         * 3.懒汉式 按需加载 线程安全，双重检查锁（DCL）（SynchronizedSingleton）
         */
//         createSynchronizedSingletonThread();
        /**
         * 4.内部类懒汉模式加载，按需加载、线程安全（InnerClassSingleton）
         */
         createInnerClassSingletonThread();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void createImmediatelySingletonThread() {
        ImmediatelySingleton instance = ImmediatelySingleton.getInstance();
        System.out.println(instance);
    }

    public void createSimpleSingletonThread() {

        SimpleSingleton instance = SimpleSingleton.getInstance();
        System.out.println(instance);
    }

    public void createSynchronizedSingletonThread() {
        SynchronizedSingleton instance = SynchronizedSingleton.getInstance();
        System.out.println(instance);
    }

    public void createInnerClassSingletonThread() {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        System.out.println(instance);
    }


}
