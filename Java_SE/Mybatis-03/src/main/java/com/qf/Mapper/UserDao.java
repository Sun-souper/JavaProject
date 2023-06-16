package com.qf.Mapper;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 一对多查询
     */
    @Select("select * from user ")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "orders", column = "id", many = @Many(select = "com.qf.Mapper.OrderDao.findById"))
    }
    )
    List<User> findAll();
}
