package com.qf.dao;

import com.qf.pojo.Account;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有
     *
     * @return
     */
    List<Account> findAll();

    /**
     * 按照id查询
     *
     * @return
     */
    List<Account> findByID(Account account);

    /**
     * 条件查询
     *
     * @param account
     * @return
     */
    List<Account> find(Account account);

    /**
     * 修改数据
     *
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 批量删除
     *
     * @param list
     */
    void delete(List<Integer> list);

    /**
     * 插入数据
     *
     * @param account
     */
    void insertAccount(Account account);
}
