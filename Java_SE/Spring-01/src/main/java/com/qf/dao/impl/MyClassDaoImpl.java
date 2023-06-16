package com.qf.dao.impl;

import com.qf.dao.MyClassDao;
import com.qf.dao.UserDao;

public class MyClassDaoImpl implements MyClassDao {
    UserDao userDao2;

    public void setUserDao(UserDao userDao) {
        this.userDao2 = userDao;
    }

    @Override
    public void findById() {
        userDao2.find();
    }
}
