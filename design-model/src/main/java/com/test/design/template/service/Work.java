/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.template.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.template.service
 * @ClassName: Work
 * @Author shanqi
 * @Date: 2019/12/30 19:01
 */
public abstract class Work {
    /**
     * 定义步凑流程
     */
    public void workDay() {
        //1:上班开机
        openComputer();
        //2:搬砖:写代码
        coding();
        //3:下班关机　　　　
        closeComputer();
    }

    /**
     * 开机
     */
    private void openComputer() {
        System.out.println("到达SNBC西安分公司，开机");
    }

    /**
     * 写代码
     */
    protected abstract void coding();

    /**
     * 关机
     */
    private void closeComputer() {
        System.out.println("下班，关机");
    }
}
