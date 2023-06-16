package Java_Jdbc.Test;

import Java_Jdbc.Object.User;
import Java_Jdbc.dao.UserDao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class UserTest {
    public static void main(String[] args) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        //获取dao对象
        UserDao userDao = new UserDao();
        //创建添加条件
        Object[] objects = {"哥哥", "JNTM"};
        //调用添加方法
        userDao.insert(objects);

        //调用查询所有
        List<User> users = userDao.selectAll();
        System.out.println(users);
//
//        //创建删除
//        Object[] objects2 = {"哥哥"};
//        userDao.delete(objects2);

        //创建查询
        Object[] objects1 = {"1"};
        //调用
        List<User> select = userDao.selectOne(objects1);
        System.out.println(select);
    }
}
