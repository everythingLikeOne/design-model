/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.iterator.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.iterator.service
 * @ClassName: Iterator
 * @Author shanqi
 * @Date: 2019/12/26
 * 定义访问和遍历聚合元素的接口，通常包含 hasNext()、next()、first() 等方法
 */
public interface Iterator {
    /**
     * 判断是否有下一个
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个的值
     *
     * @return
     */
    Object next();
}
