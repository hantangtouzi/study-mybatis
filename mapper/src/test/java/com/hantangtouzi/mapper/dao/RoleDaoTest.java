package com.hantangtouzi.mapper.dao;

import com.hantangtouzi.mapper.MapperApplication;
import com.hantangtouzi.mapper.entity.Role;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author WilliamChang.
 * Created on 2019-12-14 20:43:56
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MapperApplication.class)
public class RoleDaoTest {
    @Autowired
    private RoleDao roleDao;

    @Test
    public void getRoleById() {
        Role role = roleDao.getRoleById(1);
        System.out.println(role);
    }

    @Test
    public void findRoles() {
        List<Role> roles = roleDao.findRoles();
        for (Role role : roles) {
            System.out.println(role);
        }
    }
}