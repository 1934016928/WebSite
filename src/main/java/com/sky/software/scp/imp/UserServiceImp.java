package com.sky.software.scp.imp;

import com.sky.software.scp.dao.UserDao;
import com.sky.software.scp.entity.User;
import com.sky.software.scp.entity.result.Result;
import com.sky.software.scp.service.UserService;
import com.sky.software.scp.utils.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑层实现
 */
@Service("userService")
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result qAccount(String json) {
        User qUser = userDao.qUser((User) Json.toObject(json, User.class));
        Result result = new Result();
        if (qUser == null) {
            result.setData(false);
        } else {
            result.setData(true);
        }
        return result;
    }

    @Override
    public Result signUp(String json) {
        return null;
    }

    @Override
    public Result signIn(String json) {
        return null;
    }

    @Override
    public Result verifyCode(String json) {
        return null;
    }

    @Override
    public Result verifyPhone(String json) {
        return null;
    }

    @Override
    public Result verifyUser(String json) {
        return null;
    }

    @Override
    public Result updateUser(String json) {
        return null;
    }

    @Override
    public Result deleteUser(String json) {
        return null;
    }
}
