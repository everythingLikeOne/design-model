/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.template.main;

import com.test.design.template.service.extend.JavaProgrammer;
import com.test.design.template.service.extend.PhpProgrammer;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.template.main
 * @ClassName: MainTest
 * @Author shanqi
 * @Date: 2019/12/30 19:29
 */
public class MainTest {

    public static void main(String[] args) {
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        javaProgrammer.workDay();
        System.out.println("-------------");
        PhpProgrammer phpProgrammer = new PhpProgrammer();
        phpProgrammer.workDay();
    }
}
