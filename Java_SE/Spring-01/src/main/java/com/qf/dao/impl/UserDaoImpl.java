package com.qf.dao.impl;

import com.qf.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void findById(Integer id) {
        System.out.println("根据id查询,id为" + id);
    }

    @Override
    public void find() {
        System.out.println("自动注入...............");
    }
}
