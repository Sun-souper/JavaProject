package Java_Jdbc.dao;

import Java_Jdbc.Object.User;
import Java_Jdbc.Utils.BaseDao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends BaseDao {

    //创建修改方法
    public void update(Object[] objects) {
        String sql = "update t_user set name = ? password = ? where id = ? ";
        super.update(sql, objects);
    }

    //创建增加
    public void insert(Object[] objects) {
        String sql = "insert into t_user(name ,password) values(?,?)";
        super.update(sql, objects);
    }

    //创建删除
    public void delete(Object[] objects) {
        String sql = "delete from t_user where name = ?";
        super.update(sql, objects);
    }

    //创建查询所有
    public List<User> selectAll() throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String sql = "select * from t_user";
        Object[] objects = {};
        User user = new User();
        List<User> select = (List<User>) super.select(sql, objects, user.getClass());
        return select;
    }

    //创建条件查询
    public List<User> selectOne(Object[] objects) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String sql = "select * from t_user where id = ?";
        //获取数据存储对象
        User user = new User();
        List<User> select = (List<User>) super.select(sql, objects, user.getClass());
        return select;
    }
}
