package com.qf.jdbc;

import org.apache.commons.beanutils.BeanUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDao extends JdbcUtils {

    public void update(String sql, Object[] objects) {
        Connection connection = JdbcUtils.getConnection();

        try {
            PreparedStatement preparedStatement = null;
            if (connection != null) {
                preparedStatement = connection.prepareStatement(sql);
            }
            int parameterCount = preparedStatement.getParameterMetaData().getParameterCount();
            if (objects != null && parameterCount == objects.length) {
                for (int i = 1; i <= parameterCount; i++) {
                    preparedStatement.setObject(i, objects[i - 1]);
                }
            }
            int i = preparedStatement.executeUpdate();
            System.out.println("受影响的行数:" + i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public <T> List<T> query(String sql, Object[] objects, Class<T> tClass) {
        Connection connection = JdbcUtils.getConnection();
        List<T> list = new ArrayList<T>();

        try {
            PreparedStatement preparedStatement = null;
            if (connection != null) {
                preparedStatement = connection.prepareStatement(sql);
            }
            int parameterCount = preparedStatement.getParameterMetaData().getParameterCount();
            if (objects != null && parameterCount == objects.length) {
                for (int i = 1; i <= parameterCount; i++) {
                    preparedStatement.setObject(i, objects[i - 1]);
                }
            }
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                T t = tClass.getConstructor().newInstance();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object object = resultSet.getObject(columnName);
                    BeanUtils.setProperty(t, columnName, object);
                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
