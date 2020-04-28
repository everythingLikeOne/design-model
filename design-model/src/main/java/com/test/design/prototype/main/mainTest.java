/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.prototype.main;

import com.test.design.prototype.model.AbsoluteStudent;
import com.test.design.prototype.model.Address;
import com.test.design.prototype.model.Student;
import org.testng.annotations.Test;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.prototype.main
 * @ClassName: mainTest
 * @Author shanqi
 * @Date: 2020/1/7 16:14
 */
public class mainTest {
    /**
     * 浅拷贝测试
     */
    @Test
    public void test1() {

        // //新建一个对象 ，这个对象用作被克隆的原型
        Address address = new Address("西安市");
        // 调用原型对象的克隆方法，克隆出一个对象
        Address clone = address.clone();
        System.out.println("被克隆原型的城市名字：" + address.getLocation());
        System.out.println("克隆后实例的城市名字：" + clone.getLocation());
        System.out.println("测试原型和克隆后的实例的地址是否相等：" + (address == clone));
    }

    /**
     * 深拷贝测试
     */
    @Test
    public void test2() {
        // 新建一个对象 ，这个对象用作被克隆的原型
        Address address = new Address("西安市");
        Student student = new Student("李子明", address);
        // 调用原型对象的克隆方法，克隆出一个对象
        Student clone = student.clone();
        System.out.println("被克隆原型的学生信息：" + student);
        System.out.println("克隆后实例的学生信息：" + clone);
        System.out.println("测试原型和克隆后学生实例的地址是否相等：" + (student == clone));
        student.setName("张三");
        student.setAddress(new Address("延安市"));
        System.out.println("被克隆原型的学生信息，变更后：" + student);
        System.out.println("克隆后实例的学生信息，变更后：" + clone);

    }

    /**
     * 完全拷贝测试
     */
    @Test
    public void test3() throws Exception {

        // 新建一个对象 ，这个对象用作被克隆的原型
        Address address = new Address("西安市");
        AbsoluteStudent absoluteStudent = new AbsoluteStudent("李子明", address);
        // 调用原型对象的克隆方法，克隆出一个对象
        AbsoluteStudent clone = absoluteStudent.absoluteClone();
        System.out.println("被克隆原型的学生信息：" + absoluteStudent);
        System.out.println("克隆后实例的学生信息：" + clone);
        System.out.println("测试原型和克隆后学生实例的地址是否相等：" + (absoluteStudent == clone));
        Address addressTemp = new Address("商洛市");
        clone.setAddress(addressTemp);
        System.out.println("被克隆原型的学生信息，变更后：" + absoluteStudent);
        System.out.println("克隆后实例的学生信息，变更后：" + clone);
    }
}
