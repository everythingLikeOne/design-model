/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.singleton.main;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.test.design.singleton.service.ImmediatelySingleton;
import com.test.design.singleton.service.InnerClassSingleton;
import com.test.design.singleton.service.PrefectSingleton;
import com.test.design.singleton.service.SimpleSingleton;
import com.test.design.singleton.service.SynchronizedSingleton;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.singleton.main
 * @ClassName: MainTest
 * @Author shanqi
 * @Date: 2020/01/03 18:09
 */
public class MainTest {
    /**
     * 初始化线程池相关参数
     * @return
     */
    public static ThreadPoolExecutor newFixedThreadPool() {
        return new ThreadPoolExecutor(5, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024),// 使用有界队列，避免OOM
                new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build(),
                new ThreadPoolExecutor.AbortPolicy());
    }

    /**
     * 测试类
     */
    @Test
    public void test1 (){
        TestThread testThread = new TestThread();
        for (int i = 0; i < 10; i++) {
            newFixedThreadPool().execute(testThread);
        }
    }

    /**
     * 2.内部类懒汉模式加载，按需加载、线程安全（PrefectSingleton）
     */
    @Test
    public void test2 () throws Exception{
        System.out.println("-----------序列化----------------------");
        PrefectSingleton prefectSingleton = PrefectSingleton.getInstance();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(PrefectSingleton.getInstance());
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        PrefectSingleton serializeSingleton = (PrefectSingleton) ois.readObject();
        System.out.println(prefectSingleton == serializeSingleton);

        System.out.println("---------------------------克隆----------------------");

        PrefectSingleton cloneSingleton = (PrefectSingleton) prefectSingleton.clone();
        System.out.println(cloneSingleton == prefectSingleton);

        System.out.println("-----------反射----------------------");
        //通过反射获取
        Constructor<PrefectSingleton> cons = PrefectSingleton.class.getDeclaredConstructor();
        // 安全权限检查
        cons.setAccessible(true);
        PrefectSingleton reflextSingleton = cons.newInstance();
        System.out.println(reflextSingleton == prefectSingleton);
    }
}
