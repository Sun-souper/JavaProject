package com.qf.Jdbc;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取数据库连接
        String url = "jdbc:mysql://localhost:3306/java05?useSSL=false";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        //3.获取执行sql的对象 Statement
        Statement statement = connection.createStatement();

        //4.创建sql语句
        String sql = "update t_user set name = 'Rouse' where id = 1";

        //5.执行sql,获取结果集(受影响的行数)
        int i = statement.executeUpdate(sql);

        //6.打印结果
        System.out.println(i);

        //7.释放资源
        statement.close();
        connection.close();

    }
}
