package com.nsxy.mapper;

import com.nsxy.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectById(int id);

    User selectByName(String user);

    Integer getCount();

    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除
     *
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 动态设置表名，查询用户信息
     *
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);


    /**
     * 添加用户信息并获取自增的主键
     *
     * @param user
     */
    void insertUser(User user);
}
