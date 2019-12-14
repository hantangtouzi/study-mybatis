package com.hantangtouzi.mapper.dao;

import com.hantangtouzi.mapper.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2019-12-14 19:55:06
 */

@Repository
public interface RoleDao {
    Role getRoleById(Integer id);

    List<Role> findRoles();
}
