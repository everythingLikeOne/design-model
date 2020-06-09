package com.test.design.abstractfactory.service.impl;

import com.test.design.abstractfactory.service.Keyboard;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.abstractfactory.service.impl
 * @ClassName: DellKeyboard 戴尔键盘
 * @Author shanqi
 * @Date: 2020/6/3 11:05
 */
public class DellKeyboard implements Keyboard {
    @Override
    public String printKeyboardInfo() {
        return "生产了戴尔键盘";
    }

}