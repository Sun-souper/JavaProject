package com.qf.Jdbc;

import com.qf.pojo.User;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo05_PreparedStatement {

    /**
     * PreparedStatement 防止sql注入
     *
     * @throws Exception
     */
    @Test
    public void testPreparedStatement() throws Exception {
        //1.注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2.获取数据库连接
        String url = "jdbc:mysql:///java05?useSSL=false&useServerPreparedStatements=true";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        //3.创建sql语句
        String sql = "select * from t_user where name = ? and password = ? ";

        //4.获取statement对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Rouse");
        preparedStatement.setString(2, "or 1=1");

        //5.执行sql语句,获取结果集
        ResultSet resultSet = preparedStatement.executeQuery();

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
        preparedStatement.close();
        connection.close();
    }

}
