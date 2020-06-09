package com.test.design.abstractfactory.service.impl;

import com.test.design.abstractfactory.service.PcFactory;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.abstractfactory.service.impl
 * @ClassName: FactoryProducer 选择创建的工厂
 * @Author shanqi
 * @Date: 2020/6/3 11:05
 */
public class FactoryProducer {
    /**
     * 工厂选择器要什么工厂
     *
     * @param choice
     * @return
     */
    public static PcFactory getFactory(String choice) {
        if ("DELL".equalsIgnoreCase(choice)) {
            return new DellFactory();
        } else if ("HP".equalsIgnoreCase(choice)) {
            return new HpFactory();
        } else {
            return new HpFactory();
        }
    }
}