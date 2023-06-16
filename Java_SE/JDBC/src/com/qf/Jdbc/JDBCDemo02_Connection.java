package com.qf.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo02_Connection {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //2.获取数据库连接
        String url = "jdbc:mysql:///java05?useSSL=false";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        //3.获取执行sql的对象 Statement
        Statement statement = connection.createStatement();

        //4.创建sql语句
        String sql1 = "update t_user set name = 'Jack' where id = 1";
        String sql2 = "update t_user set name = 'Rouse' where id = 2";

        //5.开启事务
        connection.setAutoCommit(false);

        try {
            //6.执行sql,获取结果集(受影响的行数)
            int i1 = statement.executeUpdate(sql1);
            int i = 10 / 0;
            int i2 = statement.executeUpdate(sql2);

            //7.提交事务
            connection.commit();

            //8.打印结果
            System.out.println(i1 + i2);
        } catch (SQLException e) {
            //9.回滚事务
            connection.rollback();

            throw new RuntimeException(e);
        }


        //9.释放资源
        statement.close();
        connection.close();
    }
}
