package com.hantangtouzi.cache.service;

import com.hantangtouzi.cache.entity.User;
import com.hantangtouzi.cache.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WilliamChang.
 * Created on 2018/10/6 17:50
 */

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(Long userId) {
        return userMapper.getUserById(userId);
    }

    public List<User> findUsers() {
        Map<String, Object> map = new HashMap<>();
        return findUsers(map);
    }

    public List<User> findRolesByName(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return findUsers(map);
    }

    public List<User> findUsers(Map<String, Object> map) {
        return userMapper.findUsers(map);
    }

    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public Integer deleteUserById(Long userId) {
        return userMapper.deleteUserById(userId);
    }

    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
