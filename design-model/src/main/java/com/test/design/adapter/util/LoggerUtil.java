/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.adapter.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志工具类，使用静态方法打印日志
 *
 * @author shanqi
 * @date 2019/12/30 11:23
 */
public class LoggerUtil {

    /**
     * 日志工具类全限定类名
     */
    private static final String LOGGER_CLASS_NAME = LoggerUtil.class.getName();

    /**
     * 日志调用类所在包名
     */
    private static final String LOGGER_PACKAGE_NAME = "com.test";

    /**
     * 获取当前方法调用者的全限定类名
     *
     * @return String
     */
    private static String getCallerClassName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            final String className = stackTraceElement.getClassName();
            if (!LOGGER_CLASS_NAME.equals(className)
                    && className.startsWith(LOGGER_PACKAGE_NAME)) {
                // 全限定类名
                return className;
            }
        }
        return LOGGER_CLASS_NAME;
    }

    /**
     * 获取Logger对象
     *
     * @return Logger
     */
    private static Logger getLogger() {
        return LoggerFactory.getLogger(getCallerClassName());
    }

    /**
     * debug
     *
     * @param msg
     */
    public void debug(String msg) {
        msg = "******" + msg + "******";
        getLogger().debug(msg);
    }

    /**
     * info
     *
     * @param msg
     */
    public void info(String msg) {
        msg = "******" + msg + "******";
        getLogger().info(msg);
    }

    /**
     * error
     *
     * @param msg
     */
    public void error(String msg) {
        msg = "******" + msg + "******";
        getLogger().error(msg);
    }

}
