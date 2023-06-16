package com.qf.service;

import com.qf.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    List<User> findUser(User user);

    void deleteUser(List<Integer> item);
}
