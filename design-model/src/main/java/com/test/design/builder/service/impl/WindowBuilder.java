/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.builder.service.impl;

import com.test.design.builder.service.Builder;
import com.test.design.builder.service.Computer;
/**
 * @ProjectName: design-model
 * @Package: com.test.design.builder.service.impl
 * @ClassName: WindowBuilder
 * @Author shanqi
 * @Date: 2020/1/8 16:12
 */
public class WindowBuilder extends Builder {

    private Computer winComputer = new WindowComputer();
    @Override
    public void builderBoard(String board) {
        // 可以做一些window电脑特定的处理
        board = "这是windows电脑的主板：" + board;
        winComputer.setBoard(board);
    }

    @Override
    public void builderDisplay(String display) {
        // 可以做一些window电脑特定的处理
        display = "这是windows电脑的显示器：" + display;
        winComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        winComputer.setOs();
    }

    @Override
    public Computer create() {
        return winComputer;
    }
}
