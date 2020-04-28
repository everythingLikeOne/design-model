/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.iterator.service;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.iterator.service
 * @ClassName: Affregate
 * @Author shanqi
 * @Date: 2019/12/26
 * 表示集合的接口
 */
public interface Affregate {
    /**
     * 返回迭代器
     *
     * @return
     */
    Iterator iterator();
}
