package com.test.design.bridge.service;

/**
 * 类的实现层次结构：
 * DisplayService是接口类，声明三个接口open、print、cplse方法对应，进行显示前、显示、显示后处理
 *
 * @author shanqi
 */
public interface DisplayService {
    void rawOpen();

    void rawOPrint();

    void rawClose();
}
