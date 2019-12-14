package com.hantangtouzi.mapper.dao;

import com.hantangtouzi.mapper.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2019-12-14 19:54:06
 */

@Repository
public interface UserDao {
    User getUserById(Integer id);

    List<User> findUsers();

}
