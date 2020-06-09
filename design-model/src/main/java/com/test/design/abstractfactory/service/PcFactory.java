package com.test.design.abstractfactory.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.abstractfactory.service
 * @ClassName: PcFactory PC工厂
 * @Author shanqi
 * @Date: 2020/6/3 11:05
 */
public  interface PcFactory {
    /**
     * 生产鼠标
     *
     * @return
     */
    Mouse createMouse();

    /**
     * 生成键盘
     *
     * @return
     */
    Keyboard createKeyboard();
}