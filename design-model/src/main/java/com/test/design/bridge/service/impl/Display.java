package com.test.design.bridge.service.impl;

import com.test.design.bridge.service.DisplayService;

/**
 * @author shanqi
 * @projectName: design-model
 * @packageName: com.test.design.bridge.service.impl
 * @name: Display 类的功能层次结构
 * 只是调用了接口声明的三个功能：open、print、close方法,并没有绑定具体的实现
 * @date 2020/6/12
 */
public class Display {
    private DisplayService displayService;

    public Display(DisplayService displayService) {
        this.displayService = displayService;
    }

    public void open() {
        displayService.rawOpen();
    }

    public void print() {
        displayService.rawOPrint();
    }

    public void close() {
        displayService.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
