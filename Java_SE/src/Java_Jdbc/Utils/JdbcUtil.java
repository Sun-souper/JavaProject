package Java_Jdbc.Utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JdbcUtil {
    //创建连接数据准备
    private static String url; //链接地址
    private static String username; //连接用户名
    private static String password; //密码

    //创建代码块
   static  {
        try {
            //读取配置文件(类加载器的方式读取)
            InputStream resourceAsStream = JdbcUtil.class.getResourceAsStream("db.properties");
            //创建文件读取
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            //给属性赋值
            String driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            //初始化数据库连接
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //连接数据库
    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    //资源关闭
    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("数据库连接关闭失败");
        }
    }

    public static void close(PreparedStatement preparedStatement, Connection connection) {
        try {
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void close(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
        try {
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
