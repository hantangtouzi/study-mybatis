package com.hantangtouzi.basic.service;

import com.hantangtouzi.basic.BasicApplication;
import com.hantangtouzi.basic.entity.Role;
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
@SpringBootTest(classes = BasicApplication.class)
public class RoleServiceTest {
    @Autowired
    private RoleService roleService;

    @Test
    public void testGetRoleById() {
        Role role = roleService.getRoleById(1L);

        System.out.println(role);
    }

    @Test
    public void testFindRoles() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "超级管理员");
        List<Role> roles = roleService.findRoles(map);
        for (Role role : roles) {
            System.out.println(role);
        }
    }

    @Test
    public void testFindPagedRoles() {
        Map<String, Object> map = new HashMap<>();
        map.put("start", 1);
        map.put("pageSize", 2);
        List<Role> roles = roleService.findRoles(map);
        for (Role role : roles) {
            System.out.println(role);
        }
    }
}
