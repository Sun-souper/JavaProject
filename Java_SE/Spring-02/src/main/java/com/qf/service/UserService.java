package com.qf.service;

import com.qf.domarn.User;

import java.util.List;

public interface UserService {
    List<User> findById(Integer id);
}
