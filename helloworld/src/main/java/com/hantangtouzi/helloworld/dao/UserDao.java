package com.hantangtouzi.helloworld.dao;

import com.hantangtouzi.helloworld.entity.User;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2019-05-26 06:18:19
 */

public interface UserDao {
    void insert(User user);

    User findUserById(int userId);

    List<User> findAllUsers();
}
