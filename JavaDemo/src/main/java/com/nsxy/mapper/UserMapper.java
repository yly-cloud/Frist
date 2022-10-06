package com.nsxy.mapper;

import com.nsxy.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectById(int id);

    User selectByName(String user);

    Integer getCount();
}
