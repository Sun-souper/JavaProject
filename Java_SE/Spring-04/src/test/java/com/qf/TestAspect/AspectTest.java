package com.qf.TestAspect;

import com.qf.Service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {
    @Test
    public void test01() {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取实体类对象
        UserService userService = context.getBean("userService", UserService.class);
        //3.调用方法
        userService.findById();

        //4.关闭资源
        context.close();
    }
}
