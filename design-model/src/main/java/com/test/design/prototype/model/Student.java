/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.prototype.model
 * @ClassName: Student
 * @Author shanqi
 * @Date: 2020/1/7 15:50
 * 实现深拷贝
 */
@Data
@AllArgsConstructor
public class Student implements Cloneable {
    private String name;
    private Address address;

    @Override
    public Student clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
            student.address = address.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;

    }
}
