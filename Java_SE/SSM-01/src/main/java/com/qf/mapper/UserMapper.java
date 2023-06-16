package com.qf.mapper;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Select(" select * from t_user where name = #{name} and password = #{password} ")
    List<User> findUser(User user);

    @Select("<script>" +
            " delete FROM t_user WHERE id IN " +
            "<foreach collection='list' index='index' item='item' open='(' separator=',' close=')'>" +
            "#{item}" +
            "</foreach>" +
            "</script>")
    void deleteUser(List<Integer> item);
}
