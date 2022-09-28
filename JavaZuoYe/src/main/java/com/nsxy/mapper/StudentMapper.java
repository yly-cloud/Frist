package com.nsxy.mapper;

import com.nsxy.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> selectByIf(@Param("id") Integer id, @Param("name") String name,
                             @Param("age") Integer age, @Param("email") String email,
                             @Param("pwd") String pwd);

    int insert(@Param("ins") List<Student> list);

    int delete(@Param("del") Integer[] in);
}
