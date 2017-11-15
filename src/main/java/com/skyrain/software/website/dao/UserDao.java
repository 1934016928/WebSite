package com.skyrain.software.website.dao;

import com.skyrain.software.website.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 用户数据持久层
 */
@Repository("userDao")
public interface UserDao {

    void saveUser(User user);
}
