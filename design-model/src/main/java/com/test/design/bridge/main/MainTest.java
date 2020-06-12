package com.test.design.bridge.main;

import com.test.design.bridge.service.impl.CountDisplay;
import com.test.design.bridge.service.impl.Display;
import com.test.design.bridge.service.impl.StringDisplayImpl;

/**
 * @author shanqi
 * @projectName: design-model
 * @packageName: com.test.design.bridge.main
 * @name: MainTest 测试类
 * @date 2020/6/12
 */
public class MainTest {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("hello,world!"));
        display.display();
        Display display1 = new CountDisplay(new StringDisplayImpl("hello,China!"));
        display1.display();
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("hello,SNBC!"));
        countDisplay.loopDisplay(2);

    }
}
