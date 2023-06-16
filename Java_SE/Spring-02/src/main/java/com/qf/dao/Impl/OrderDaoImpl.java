package com.qf.dao.Impl;

import com.qf.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {
    @Override
    public void find() {
        System.out.println("Order方法..............");
    }
}
