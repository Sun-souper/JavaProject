package com.qf.Mapper;

import com.qf.pojo.User;

import java.util.List;

public interface UserMapper {

    int insertUser(User user);

    List<User> selectUser(int id);
}
