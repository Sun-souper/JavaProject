package Java_Jdbc.Utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDao {
    private static Connection connection;
    //创建数据库连接
    JdbcUtil jdbcUtil = new JdbcUtil();


    //创建数据库修改
    public void update(String sql, Object[] objects) {
        try {
            connection = jdbcUtil.getConnection();
            //创建数据缓存读取
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //获取预计字段个数
            int parameterCount = preparedStatement.getParameterMetaData().getParameterCount();
            //判断传入字段个数
            if (objects.length != 0 && objects.length == parameterCount) {
                //把字段存入位置
                for (int i = 1; i <= parameterCount; i++) {
                    preparedStatement.setObject(i, objects[i - 1]);
                }
            }
            //执行sql语句
            int i = preparedStatement.executeUpdate();
            System.out.println("执行了" + i + "条语句");
            JdbcUtil.close(preparedStatement, connection);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //创建数据库查询
    public <T> List<T> select(String sql, Object[] objects, Class<T> tClass) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<T> list = new ArrayList<>();
        connection = jdbcUtil.getConnection();

        //创建缓存读取
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //获取字段个数
        int parameterCount = preparedStatement.getParameterMetaData().getParameterCount();
        //判断
        if (objects.length != 0 && parameterCount == objects.length) {
            //循环
            for (int i = 1; i <= parameterCount; i++) {
                preparedStatement.setObject(i, objects[i - 1]);
            }
        }
        //执行
        ResultSet resultSet = preparedStatement.executeQuery();
        //获取元数据对象
        ResultSetMetaData metaData = resultSet.getMetaData();
        //获取数据条数
        int columnCount = metaData.getColumnCount();
        //循环获取
        while (resultSet.next()) {
            T t = tClass.getConstructor(null).newInstance(null);
            for (int i = 1; i <= columnCount; i++) {
                //获取字段名
                String columnName = resultSet.getMetaData().getColumnName(i);
                //获取数据值
                Object object = resultSet.getObject(columnName);
                //存入对象属性
                BeanUtils.setProperty(t, columnName, object);
            }
            //存入集合
            list.add(t);
        }
        JdbcUtil.close(resultSet, preparedStatement, connection);
        return list;

    }
}
