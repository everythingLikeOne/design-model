package com.test.design.abstractfactory.service.impl;

import com.test.design.abstractfactory.service.Mouse;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.abstractfactory.service.impl
 * @ClassName: DellMouse 戴尔鼠标
 * @Author shanqi
 * @Date: 2020/6/3 11:05
 */
public class DellMouse implements Mouse {

    @Override
    public String printMouseInfo() {
        return "生产了戴尔鼠标";
    }

}