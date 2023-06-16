package com.qf.Mapper;

import com.qf.pojo.Order;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderDao {
    /**
     * 根据user_id查询
     */
    @Select("select * from orders where user_id=#{id}")
    Order findById(Integer user_id);
}
