package com.skyrain.software.website.imp;

import com.skyrain.software.website.dao.UserDao;
import com.skyrain.software.website.entity.User;
import com.skyrain.software.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑层实现
 */
@Service("userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.saveUser(user);
    }
}
