package com.qf;

import com.qf.Mapper.UserMapper;
import com.qf.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {

    /**
     * SqlSession 默认不自动提交事务
     */
    @Test
    public void testMybatis() throws IOException {
        //1.加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("Mybatis-Config.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //3.获取sqlSession对象 true开启自动提交 JDBC默认关闭
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4.获取dao类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setId(3);
        user.setName("jar");
        user.setPassword("123456");

        //5.调用方法
        int i = userMapper.insertUser(user);
        System.out.println(i);

        //6.释放资源
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void testMybatis2() throws IOException {
        //1.加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("Mybatis-Config.xml");
        //2.创建SqlSession工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //3.创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUser(1);
        System.out.println(users);
    }


}
