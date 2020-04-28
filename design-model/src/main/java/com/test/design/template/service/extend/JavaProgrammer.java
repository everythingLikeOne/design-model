/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.template.service.extend;

import com.test.design.template.service.Work;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.template.service.extend
 * @ClassName: JavaProgrammer
 * @Author shanqi
 * @Date: 2019/12/30 19:06
 */
public class JavaProgrammer extends Work {

    @Override
    protected void coding() {
        System.out.println("java程序员写java代码......");
    }
}

