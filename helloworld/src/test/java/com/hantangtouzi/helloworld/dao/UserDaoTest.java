package com.hantangtouzi.helloworld.dao;

import com.hantangtouzi.helloworld.entity.User;
import com.hantangtouzi.helloworld.util.DbUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author WilliamChang.
 * Created on 2019-05-26 06:53:44
 */

public class UserDaoTest {
    @Test
    public void findUserById() {
        SqlSession sqlSession = DbUtil.getSessionFactory().openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.findUserById(1);
        Assert.assertEquals("zhangsan", user.getName());
    }
}
