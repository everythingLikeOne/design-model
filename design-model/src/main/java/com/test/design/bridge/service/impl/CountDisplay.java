package com.test.design.bridge.service.impl;

import com.test.design.bridge.service.DisplayService;

/**
 * @author shanqi
 * @projectName: design-model
 * @packageName: com.test.design.bridge.service.impl
 * @name: CountDisplay 类的功能层次结构：
 * 现在要在原有三个功能基础上添加一个功能，我们此时并没有依赖于实现层次的修改，只是在功能层次添加的方法实现而已，这就是解耦的好处
 * @date 2020/6/12
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayService displayService) {
        super(displayService);
    }

    public void loopDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
