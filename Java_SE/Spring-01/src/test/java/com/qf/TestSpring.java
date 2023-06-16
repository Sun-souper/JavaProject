package com.qf;

import com.qf.dao.MyClassDao;
import com.qf.pojo.DIClass;
import com.qf.pojo.MyClass;
import com.qf.service.Impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring是先创建出对象
 */
public class TestSpring {
    @Test
    public void test01() {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean对象
        MyClass myClass = (MyClass) context.getBean("myClass");
        //3.调用方法
        myClass.test();
    }

    @Test
    public void test02() {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean对象
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        //3.调用方法
        userService.findById(1);
    }

    @Test
    public void test03() {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean对象
        DIClass dIClass = context.getBean("dIClass", DIClass.class);
        //3.调用
        String string = dIClass.toString();
        //4.打印
        System.out.println(string);
    }


    @Test
    public void test04() {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean对象
        MyClassDao myClassDao = context.getBean("myClassDao", MyClassDao.class);
        //3.调用
        myClassDao.findById();
    }


}
