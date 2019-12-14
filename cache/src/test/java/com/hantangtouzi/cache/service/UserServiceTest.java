package com.hantangtouzi.cache.service;

import com.hantangtouzi.cache.CacheApplication;
import com.hantangtouzi.cache.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WilliamChang.
 * Created on 2018/10/6 18:08
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CacheApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testFindUsers() {
        Map<String, Object> map = new HashMap<>();
        map.put("username","zhangsan");
        List<User> users = userService.findUsers(map);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
