package com.qf.Test;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import org.junit.Test;

import java.util.List;

public class JdbcTest {
    @Test
    public void testUpdate() {
        UserDao userDao = new UserDao();
        Object[] objects = {2};
        List<User> users = userDao.query(objects);
        System.out.println(users);

//        Object[] objects1 = {"tom", 10};
//        userDao.update(objects1);
    }
}
