package com.qf.mapper;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from t_user")
    List<User> findAll();
}
