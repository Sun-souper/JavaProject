package com.qf.Mapper;

import com.qf.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountDao {

    @Select("select * from account")
    List<Account> queryAll();

    @Select("select * from account where id =#{id}")
    List<Account> queryById(Integer id);

}
