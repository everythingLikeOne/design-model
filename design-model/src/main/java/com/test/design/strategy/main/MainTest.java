package com.test.design.abstractfactory.main;

import com.test.design.abstractfactory.service.Keyboard;
import com.test.design.abstractfactory.service.Mouse;
import com.test.design.abstractfactory.service.PcFactory;
import com.test.design.abstractfactory.service.impl.FactoryProducer;

/**
 * @author shanqi
 * @projectName design-model
 * @PackageName com.test.design.abstractfactory.main
 * @name MainTest
 * @date 2020/6/9
 */
public class MainTest {
    public static void main(String[] args) {
        PcFactory dellPcFactory = FactoryProducer.getFactory("DELL");
        Mouse dellMouse = dellPcFactory.createMouse();
        String mouse1 = dellMouse.printMouseInfo();
        System.out.println(mouse1);

        PcFactory hpPcFactory = FactoryProducer.getFactory("HP");
        Keyboard hpKeyboard = hpPcFactory.createKeyboard();
        String keyboard = hpKeyboard.printKeyboardInfo();
        System.out.println(keyboard);
    }
}
