package com.qf.service.Impl;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findUser(User user) {
        return userMapper.findUser(user);
    }

    @Override
    public void deleteUser(List<Integer> item) {
        userMapper.deleteUser(item);
    }
}
