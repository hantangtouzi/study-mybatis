package com.hantangtouzi.cache.service;

import com.hantangtouzi.cache.CacheApplication;
import com.hantangtouzi.cache.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: WilliamChang.
 * Created on 2018/10/6 15:00
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CacheApplication.class)
public class RoleServiceTest {
    @Autowired
    private RoleService roleService;

    @Test
    public void testFindRoles() {
        Map<String, Object> map = new HashMap<>();
        map.put("name","超级管理员");
        List<Role> roles = roleService.findRoles(map);
        for (Role role : roles) {
            System.out.println(role);
        }
    }
}
