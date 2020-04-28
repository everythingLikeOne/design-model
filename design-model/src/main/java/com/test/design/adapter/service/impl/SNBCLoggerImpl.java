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
 * @ClassName: SNBCLoggerImpl
 * @Author shanqi
 * @Date: 2019/12/30 13:54
 */
public class SNBCLoggerImpl extends LoggerUtil implements SNBCLoggerService {

    @Override
    public void SNBCDebug(String msg) {
        msg = "SNBC:" + msg;
        debug(msg);

    }

    @Override
    public void SNBCInfo(String msg) {
        msg = "SNBC:" + msg;
        info(msg);

    }

    @Override
    public void SNBCError(String msg) {
        msg = "SNBC:" + msg;
        error(msg);

    }
}
