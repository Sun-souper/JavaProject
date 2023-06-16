package com.qf.Test;

import com.qf.Mapper.AccountDao;
import com.qf.Mapper.UserDao;
import com.qf.pojo.Account;
import com.qf.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountTest {
    @Test
    public void test01() throws IOException {
        //1.加载xml文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSession工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取Dao对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //5.调用方法
        List<Account> accounts = accountDao.queryAll();
        //5.打印
        System.out.println(accounts);
    }

    @Test
    public void test02() throws IOException {
        //1.加载xml文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSession工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取Dao对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //5.调用方法
        List<Account> accounts = accountDao.queryById(1);
        //5.打印
        System.out.println(accounts);
    }

    @Test
    public void test03() throws IOException {
        //1.加载xml文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSession工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取Dao对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //5.调用方法
        List<User> list = userDao.findAll();
        //6.打印
        System.out.println(list);
    }
}
