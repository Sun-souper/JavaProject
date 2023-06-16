package com.qf.Jdbc;

import com.qf.pojo.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo04_ResultSet {
    @Test
    public void testResultSet() throws Exception {
        //1.注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2.获取数据库连接
        String url = "jdbc:mysql:///java05?useSSL=false";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        //3.创建sql语句
        String sql = "select * from t_user";

        //4.获取statement对象
        Statement statement = connection.createStatement();

        //5.执行sql语句,获取结果集
        ResultSet resultSet = statement.executeQuery(sql);

        //6.处理结果 (遍历)
        while (resultSet.next()) {
            //7.获取数据 getXxx()
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String pwd = resultSet.getString(3);

            //8.打印结果
            System.out.println(id);
            System.out.println(name);
            System.out.println(pwd);

            System.out.println("================================");
        }

        //9.释放资源
        statement.close();
        connection.close();
    }

    @Test
    public void testResultSetUser() throws Exception {
        //1.注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2.获取数据库连接
        String url = "jdbc:mysql:///java05?useSSL=false";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        //3.创建sql语句
        String sql = "select * from t_user";

        //4.获取statement对象
        Statement statement = connection.createStatement();

        //5.执行sql语句,获取结果集
        ResultSet resultSet = statement.executeQuery(sql);

        //6.创建存储对象的集合
        List<User> users = new ArrayList<User>();

        //7.处理结果 (遍历)
        while (resultSet.next()) {
            //8.获取数据 getXxx()
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String pwd = resultSet.getString(3);

            //9.创建对象存入数据
            User user1 = new User();
            user1.setId(id);
            user1.setName(name);
            user1.setPassword(pwd);

            //10.将对象存入集合
            users.add(user1);

            //11.打印结果
            System.out.println(id);
            System.out.println(name);
            System.out.println(pwd);

            System.out.println("================================");
        }
        //11.打印集合数据
        for (User user2 : users) {
            System.out.println(user2);
        }

        //12.释放资源
        statement.close();
        connection.close();
    }
}
