package com.nsxy;

import com.nsxy.mapper.EmployeeMapper;
import com.nsxy.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class EmployeeTest {
    @Test
    public void selectById() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = mapper.selectById(2);
        System.out.println(employee);

        sqlSession.close();
    }

    @Test
    public void add() throws Exception {
        String name = "赵六";
        int age = 24;
        String position = "员工";

        Employee employee = new Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setPosition(position);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        int add = mapper.add(employee);
        System.out.println(add);

        sqlSession.close();
    }

    @Test
    public void update() throws Exception {
        int id = 4;
        int age = 26;
        String position = "经理";

        Employee employee = new Employee();
        employee.setId(id);
        employee.setAge(age);
        employee.setPosition(position);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        int update = mapper.update(employee);
        System.out.println(update);

        sqlSession.close();
    }

    @Test
    public void deleteById() throws Exception {
        int id = 4;

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        int delete = mapper.deleteById(id);
        System.out.println(delete);

        sqlSession.close();
    }
}
