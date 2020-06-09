package com.test.design.abstractfactory.service.impl;

import com.test.design.abstractfactory.service.Keyboard;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.abstractfactory.service.impl
 * @ClassName: HpKeyboard 惠普键盘
 * @Author shanqi
 * @Date: 2020/6/3 11:05
 */
public class HpKeyboard implements Keyboard {

    @Override
    public String printKeyboardInfo() {
        return "生产了惠普键盘";
    }

}