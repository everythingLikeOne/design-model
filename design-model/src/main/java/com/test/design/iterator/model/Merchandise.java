/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.iterator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.model
 * @ClassName: Merchandise
 * @Author shanqi
 * @Date: 2019/12/26 14:26
 * 商品类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Merchandise {

    /**
     * id
     */
    private String id;
    /**
     * 商品名称
     */
    private String mercName;
    /**
     * 商品价格
     */
    private Double price;
}
