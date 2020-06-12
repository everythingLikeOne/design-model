package com.test.design.bridge.service.impl;

import com.test.design.bridge.service.DisplayService;

/**
 * @author shanqi
 * @projectName: design-model
 * @packageName: com.test.design.bridge.service.impl
 * @name: StringDisplayImpl 类的实现层次结构：
 * 针对字符串打印实现的具体方法
 * @date 2020/6/12
 */
public class StringDisplayImpl implements DisplayService {
    /**
     * 要显示的字符串
     */
    private String string;

    /**
     * 以字节为单位计算出的字符串的宽度
     */
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawOPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
