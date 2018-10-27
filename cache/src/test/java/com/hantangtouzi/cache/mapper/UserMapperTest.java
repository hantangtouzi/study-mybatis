package com.hantangtouzi.cache.mapper;

import com.hantangtouzi.cache.CacheApplication;
import com.hantangtouzi.cache.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: WilliamChang.
 * Created on 2018/10/6 18:26
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CacheApplication.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetUserById() {
        User user = userMapper.getUserById(1L);
        System.out.println(user);
    }
}
