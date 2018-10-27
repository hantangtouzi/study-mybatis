package com.hantangtouzi.basic.mapper;

import com.hantangtouzi.basic.entity.User;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/10/6 11:04 AM
 */

public interface UserMapper {
    User getUserById(Long userId);

    List<User> findUsers();

    Integer insertUser(User user);

    Integer deleteUserById(Long userId);

    Integer updateUser(User user);
}
