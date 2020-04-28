/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.prototype.model
 * @ClassName: AbsoluteStudent
 * @Author shanqi
 * @Date: 2020/1/7 15:57
 * 完全的拷贝
 */
@Data
@AllArgsConstructor
public class AbsoluteStudent implements Serializable {
    private static final long serialVersionUID = -640684973954293036L;
    private String name;
    private Address address;

    /**
     * 使用序列化技术实现完全拷贝
     *
     * @return
     */
    public AbsoluteStudent absoluteClone() throws IOException, ClassNotFoundException {
        // 将对象写入流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 从流中读出对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (AbsoluteStudent) ois.readObject();

    }
}
