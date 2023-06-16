package com.qf.service.Impl;

import com.qf.dao.UserDao;
import com.qf.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void findById(Integer id) {
        userDao.findById(id);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
