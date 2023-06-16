package com.qf.dao.Impl;

import com.qf.dao.OrderDao;
import com.qf.dao.UserDao;
import com.qf.domarn.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    OrderDao orderDao;

    @Override
    public List<User> findById(Integer id) {
        orderDao.find();
        return null;
    }
}
