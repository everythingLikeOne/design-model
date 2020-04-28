/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.builder.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.builder.service
 * @ClassName: Computer
 * @Author shanqi
 * @Date: 2020/1/8 16:02
 * 电脑类
 */
public class Computer {

    /**
     *  主板
     */
    private String board;
    /**
     *  显示器
     */
    private String display;
    /**
     *  操作系统
     */
    protected String os;

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getOs() {
        return os;
    }

    public void setOs(){
    }
    @Override
    public String toString() {
        return "Computer{" +
                "board='" + board + '\'' +
                ", display='" + display + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

}
