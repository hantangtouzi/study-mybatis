package com.hantangtouzi.mapper.dao;

import com.hantangtouzi.mapper.MapperApplication;
import com.hantangtouzi.mapper.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author WilliamChang.
 * Created on 2019-12-14 20:03:51
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MapperApplication.class)
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void getUserById() {
        User user = userDao.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUsers() {
        List<User> users = userDao.findUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}