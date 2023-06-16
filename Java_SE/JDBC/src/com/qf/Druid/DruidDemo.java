package com.qf.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    @Test
    public void test01() throws Exception {
        //1.导入jar包
        //2.定义配置文件

        //3.加载配置文件
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("druid.properties"));

        //4.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //5.获取丢赢得数据库连接
        Connection connection = dataSource.getConnection();

        //6.打印
        System.out.println(connection);
    }
}
