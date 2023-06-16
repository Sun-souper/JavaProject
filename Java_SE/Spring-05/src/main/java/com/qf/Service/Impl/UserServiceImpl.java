package com.qf.Service.Impl;

import com.qf.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void findById() {
        System.out.println("事务主体...");
    }
}
