/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.builder.service.impl;

import com.test.design.builder.service.Computer;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.builder.service.impl
 * @ClassName: WindowComputer
 * @Author shanqi
 * @Date: 2020/1/8 16:15
 */
public class WindowComputer extends Computer {

    /**
     * 设置操作系统
     */
    @Override
    public void setOs(){
        this.os = "windows10";
    }
}
