package com.hantangtouzi.basic.mapper;

import com.hantangtouzi.basic.BasicApplication;
import com.hantangtouzi.basic.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WilliamChang.
 * Created on 2018/10/6 11:39 AM
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BasicApplication.class)
public class RoleMapperTest {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testGetRoleById() {
        Role role = roleMapper.getRoleById(1L);
        System.out.println(role);
    }

    @Test
    public void testFindRoles() {
        Map<String, Object> map = new HashMap<>();
        List<Role> roles = roleMapper.findRoles(map);
        for (Role role : roles) {
            System.out.println(role);
        }
    }

    @Test
    public void testInsertRole() {
        Role role = new Role();
        role.setName("VIP");
        role.setDescription("VIP会员");
        Integer roleId = roleMapper.insertRole(role);
        System.out.println("共插入了【 " + roleId + " 】条记录!");

        Map<String, Object> map = new HashMap<>();
        List<Role> roles = roleMapper.findRoles(map);
        System.out.println("插入完成后共有【 " + roles.size() + " 】条记录!");
    }

}
