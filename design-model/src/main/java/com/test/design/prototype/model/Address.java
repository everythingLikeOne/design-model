/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.prototype.model
 * @ClassName: Address
 * @Author shanqi
 * @Date: 2020/1/7 15:02
 * 实现浅拷贝
 */
@Data
@AllArgsConstructor
public class Address implements Cloneable, Serializable {
    private static final long serialVersionUID = -4710534185823339883L;
    private String location;

    @Override
    public Address clone() {
        Address address = null;
        try {
            address = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }
}
