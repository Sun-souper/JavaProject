package com.qf.service.Impl;

import com.qf.dao.UserDao;
import com.qf.domarn.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> findById(Integer id) {
        userDao.findById(id);
        return null;
    }
}
