/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.builder.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.builder.service
 * @ClassName: Builder
 * @Author shanqi
 * @Date: 2020/1/8 16:05
 */
public abstract class Builder {
    /**
     * 生成主机
     * @param board
     */
    public abstract void builderBoard(String board);

    /**
     * 生成显示器
     * @param display
     */
    public abstract void builderDisplay(String display);

    /**
     * 生成操作系统
     */

    public abstract void buildOS();

    /**
     * 创建电脑
     * @return
     */
    public abstract Computer create();

}
