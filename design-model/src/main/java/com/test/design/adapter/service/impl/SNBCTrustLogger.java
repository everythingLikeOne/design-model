/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.adapter.service.impl;

import com.test.design.adapter.service.SNBCLoggerService;
import com.test.design.adapter.util.LoggerUtil;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.adapter.service.impl
 * @ClassName: SNBCTrustLogger
 * @Author shanqi
 * @Date: 2019/12/30 14:52
 */
public class SNBCTrustLogger implements SNBCLoggerService {

    private LoggerUtil loggerUtil;

    public SNBCTrustLogger() {
        this.loggerUtil = new LoggerUtil();
    }

    @Override
    public void SNBCDebug(String msg) {
        msg = "SNBC:" + msg;
        loggerUtil.debug(msg);
    }

    @Override
    public void SNBCInfo(String msg) {
        msg = "SNBC:" + msg;
        loggerUtil.info(msg);
    }

    @Override
    public void SNBCError(String msg) {
        msg = "SNBC:" + msg;
        loggerUtil.error(msg);
    }
}
