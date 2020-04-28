/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.adapter.service;

/**
 * The interface Snbc logger service.
 *
 * @ProjectName: design -model
 * @Package: com.test.design.adapter.service
 * @ClassName: SNBCLoggerService
 * @Author shanqi
 * @Date: 2019 /12/30 13:51
 */
public interface SNBCLoggerService {

    /**
     * Snbc debug.
     *
     * @param msg the msg
     */
    void SNBCDebug(String msg);

    /**
     * Snbc info.
     *
     * @param msg the msg
     */
    void SNBCInfo(String msg);

    /**
     * Snbc error.
     *
     * @param msg the msg
     */
    void SNBCError(String msg);
}
