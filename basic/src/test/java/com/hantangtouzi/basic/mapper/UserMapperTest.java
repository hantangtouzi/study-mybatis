package com.hantangtouzi.basic.mapper;

import com.hantangtouzi.basic.BasicApplication;
import com.hantangtouzi.basic.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/10/6 11:39 AM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BasicApplication.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetUserById() {
        User user = userMapper.getUserById(1L);
        System.out.println(user);
    }

    @Test
    public void testFindUsers() {
        List<User> users = userMapper.findUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
