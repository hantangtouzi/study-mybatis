package com.hantangtouzi.basic.service;

import com.hantangtouzi.basic.entity.Role;
import com.hantangtouzi.basic.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WilliamChang.
 * Created on 2018/10/6 1:37 PM
 */

@Service
public class RoleService {
    @Resource
    private RoleMapper roleMapper;

    public Role getRoleById(Long roleId) {
        return roleMapper.getRoleById(roleId);
    }

    public List<Role> findRoles() {
        Map<String, Object> map = new HashMap<>();
        return findRoles(map);
    }

    public List<Role> findRolesByName(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return findRoles(map);
    }

    public List<Role> findRoles(Map<String,Object> map) {
        return roleMapper.findRoles(map);
    }

    public Integer insertRole(Role role) {
        return roleMapper.insertRole(role);
    }

    public Integer deleteRoleById(Long roleId) {
        return roleMapper.deleteRoleById(roleId);
    }

    public Integer updateRole(Role role) {
        return roleMapper.updateRole(role);
    }
}
