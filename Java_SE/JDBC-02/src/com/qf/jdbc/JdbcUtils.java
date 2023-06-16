package com.qf.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mysql.jdbc.PreparedStatement;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private static DataSource dataSource;

    static {
        try {
            //读取properties文件
            Properties properties = new Properties();
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //创建德鲁伊连接
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //创建数据库连接
    public static Connection getConnection() {
        Connection connection;
        try {
            connection = dataSource.getConnection();
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //创建释放资源方法
    public static void close(PreparedStatement preparedStatement, Connection connection) {
        try {
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
