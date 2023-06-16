package com.qf.dao;

import com.qf.jdbc.BaseDao;
import com.qf.pojo.User;

import java.util.List;

public class UserDao extends BaseDao {
    public void update(Object[] objects) {
        String sql = "update t_user set name = ? where id = ?";
        super.update(sql, objects);
    }

    public List<User> query(Object[] objects) {
        String sql = "select * from t_user where 1=1 and id = ?";
        User user = new User();
        List<User> list = (List<User>) super.query(sql, objects, user.getClass());
        return list;
    }
}
