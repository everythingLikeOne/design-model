/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.adapter.main;

import com.test.design.adapter.service.SNBCLoggerService;
import com.test.design.adapter.service.impl.SNBCLoggerImpl;
import com.test.design.adapter.service.impl.SNBCTrustLogger;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.adapter.main
 * @ClassName: MainTest
 * @Author shanqi
 * @Date: 2019/12/31 11:29
 */
public class MainTest {

    public static void main(String[] args) {
        SNBCLoggerService loggerService = new SNBCLoggerImpl();
        loggerService.SNBCDebug("测试演示");
//        SNBCTrustLogger snbcTrustLogger = new SNBCTrustLogger();
//        snbcTrustLogger.SNBCInfo("测试演示trust");
    }
}
