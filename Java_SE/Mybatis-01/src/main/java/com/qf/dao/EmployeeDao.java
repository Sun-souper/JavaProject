package com.qf.dao;

import com.qf.pojo.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> selectEmployee();
}
