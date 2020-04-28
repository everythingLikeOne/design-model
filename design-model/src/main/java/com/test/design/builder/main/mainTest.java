/**
 * 版权所有 2009-2012山东新北洋信息技术股份有限公司
 * 保留所有权利
 */
package com.test.design.builder.main;

import com.test.design.builder.service.Builder;
import com.test.design.builder.service.Computer;
import com.test.design.builder.service.impl.Director;
import com.test.design.builder.service.impl.Request;
import com.test.design.builder.service.impl.WindowBuilder;
import org.testng.annotations.Test;

/**
 * @ProjectName: design-model
 * @Package: com.test.design.builder.main
 * @ClassName: mainTest
 * @Author shanqi
 * @Date: 2020/1/8 16:36
 */
public class mainTest {
    /**
     * 普通构建者模式
     */
    @Test
    public void test (){
        Builder builder = new WindowBuilder();
        Director director = new Director(builder);
        // 构建电脑过程
        director.construct("intel主板", "三星显示器");
        // 生产电脑
        Computer computer = builder.create();
        System.out.println(computer.toString());
    }

    /**
     * 变种builder模式测试
     */
    @Test
    public void test1 (){
        String url = "http://wwww.baidu.com";
//        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()//默认就是GET请求，可以不写
                .tag("tag")
                .build();
        System.out.println("request:" + request.toString());
//        Call call = okHttpClient.newCall(request);
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                System.out.println("onFailure");
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                System.out.println("onResponse" + response.body().toString());
//            }
//        });
    }

}
