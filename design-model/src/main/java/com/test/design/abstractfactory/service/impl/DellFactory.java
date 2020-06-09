package com.test.design.abstractfactory.service.impl;

import com.test.design.abstractfactory.service.Keyboard;
import com.test.design.abstractfactory.service.Mouse;
import com.test.design.abstractfactory.service.PcFactory;

/**
 * @ProjectName: design-model
 * @Package com.test.design.abstractfactory.service.impl
 * @ClassName: DellFactory 戴尔工厂
 * @Author shanqi
 * @Date: 2020/6/3 11:05
 */
public class DellFactory implements PcFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }

}