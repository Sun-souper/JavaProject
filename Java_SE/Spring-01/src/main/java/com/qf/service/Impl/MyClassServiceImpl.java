package com.qf.service.Impl;

import com.qf.dao.MyClassDao;
import com.qf.dao.UserDao;
import com.qf.service.MyClassService;

public class MyClassServiceImpl implements MyClassService {
    MyClassDao myClassDao2;

    public void setMyClassDao(MyClassDao myClassDao) {
        this.myClassDao2 = myClassDao;
    }

    @Override
    public void findById() {
        myClassDao2.findById();
    }
}
