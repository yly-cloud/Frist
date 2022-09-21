package com.nsxy;

import com.nsxy.mapper.StudentMapper;
import com.nsxy.pojo.Student;
import com.nsxy.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void selectByIf() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSeesion();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.selectByIf(1, "云乐仪", null, null, null);
        System.out.println(students);
    }
}
