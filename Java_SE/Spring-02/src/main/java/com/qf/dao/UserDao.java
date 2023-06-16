package com.qf.dao;

import com.qf.domarn.User;

import java.util.List;

public interface UserDao {

    List<User> findById(Integer id);
}
