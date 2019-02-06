package com.hantangtouzi.mybatis.helloworld.mapper;

import com.hantangtouzi.mybatis.helloworld.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author WilliamChang.
 * Created on 2019-02-06 15:47:04
 */

public class UserMapperTest {
    public static void main(String[] args) {
        try {
            User user = getUserById(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static User getUserById(Integer userId) throws IOException {
        String source = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("getUserById", userId);

        sqlSession.close();

        return user;
    }
}
