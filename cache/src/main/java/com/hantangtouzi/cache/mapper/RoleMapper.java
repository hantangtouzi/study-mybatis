package com.hantangtouzi.cache.mapper;

import com.hantangtouzi.cache.entity.Role;

import java.util.List;
import java.util.Map;

/**
 * @author WilliamChang.
 * Created on 2018/10/6 11:09 AM
 */

public interface RoleMapper {
    Role getRoleById(Long roleId);

    List<Role> findRoles(Map<String, Object> map);

    Integer insertRole(Role role);

    Integer deleteRoleById(Long roleId);

    Integer updateRole(Role role);
}
