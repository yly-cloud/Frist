package com.nsxy;

import com.nsxy.Utils.SqlSessionUtils;
import com.nsxy.mapper.UserMapper;
import com.nsxy.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserTest {
    @Test
    public void userFindByIdTest() {
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlMapper.openSession();
        User user = session.selectOne("findById", 1);
        System.out.println(user.getUname());
        session.close();
    }

    @Test
    public void selectById() {
        SqlSessionUtils sqlSessionUtils = new SqlSessionUtils();
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SqlSession sqlSession = sqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectById(2);
        System.out.println(users);

        sqlSession.close();
    }

    @Test
    public void selectByName() {
        SqlSessionUtils sqlSessionUtils = new SqlSessionUtils();
        SqlSession sqlSession = sqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.selectByName("张三");
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void getCount() {
        SqlSessionUtils sqlSessionUtils = new SqlSessionUtils();
        SqlSession sqlSession = sqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Integer count = mapper.getCount();
        System.out.println(count);

        sqlSession.close();
    }
}
