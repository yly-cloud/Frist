package com.nsxy.mapper;

import com.nsxy.pojo.Employee;

public interface EmployeeMapper {
    Employee selectById(int id);

    int add(Employee employee);

    int update(Employee employee);

    int deleteById(int id);
}
