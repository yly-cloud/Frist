package com.nsxy;

import com.nsxy.mapper.StudentMapper;
import com.nsxy.pojo.Student;
import com.nsxy.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    @Test
    public void selectByIf() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.selectByIf(1, "云乐仪", null, null, null);
        System.out.println(students);
    }

    @Test
    public void insert() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student stu1 = new Student(null, "姓名1", 20, "111@qq.com", "111");
        Student stu2 = new Student(null, "姓名2", 21, "222@qq.com", "222");
        Student stu3 = new Student(null, "姓名3", 22, "333@qq.com", "333");
        Student stu4 = new Student(null, "姓名4", 23, "444@qq.com", "444");

        List<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

        int insert = mapper.insert(students);
        System.out.println(insert);
        sqlSession.close();
    }

    @Test
    public void delete() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Integer[] arr = {4, 5, 6};
        int delete = mapper.delete(arr);
        System.out.println(delete);
        sqlSession.close();
    }
}
