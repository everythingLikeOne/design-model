/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.builder.service.impl;

import com.test.design.builder.service.Builder;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.builder.service.impl
 * @ClassName: Director
 * @Author shanqi
 * @Date: 2020/1/8 16:27
 * 负责构造电脑
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装电脑
     * @param board
     * @param display
     */
    public void construct(String board, String display){
        builder.builderBoard(board);
        builder.builderDisplay(display);
        builder.buildOS();
    }
}
