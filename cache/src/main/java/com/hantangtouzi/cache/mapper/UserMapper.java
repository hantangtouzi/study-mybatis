package com.hantangtouzi.cache.mapper;

import com.hantangtouzi.cache.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author WilliamChang.
 * Created on 2018/10/6 11:04 AM
 */

public interface UserMapper {
    User getUserById(Long userId);

    List<User> findUsers(Map<String, Object> map);

    Integer insertUser(User user);

    Integer deleteUserById(Long userId);

    Integer updateUser(User user);
}
