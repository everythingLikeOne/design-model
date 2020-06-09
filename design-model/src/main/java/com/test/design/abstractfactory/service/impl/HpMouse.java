package com.test.design.abstractfactory.service.impl;

import com.test.design.abstractfactory.service.Mouse;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.abstractfactory.service.impl
 * @ClassName: HpMouse 惠普鼠标
 * @Author shanqi
 * @Date: 2020/6/3 11:05
 */
public class HpMouse implements Mouse {

    @Override
    public String printMouseInfo() {
        return "生产了惠普鼠标";
    }

}