/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.template.service.extend;

import com.test.design.template.service.Work;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.template.service.extend
 * @ClassName: PhpProgrammer
 * @Author shanqi
 * @Date: 2019/12/30 19:09
 */
public class PhpProgrammer extends Work {

    @Override
    protected void coding() {
        System.out.println("php程序员写php代码......");
    }
}
