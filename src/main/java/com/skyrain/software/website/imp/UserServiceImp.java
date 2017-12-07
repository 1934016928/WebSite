package com.skyrain.software.website.imp;

import com.skyrain.software.website.dao.UserDao;
import com.skyrain.software.website.entity.User;
import com.skyrain.software.website.entity.result.Result;
import com.skyrain.software.website.service.UserService;
import com.skyrain.software.website.state.State;
import com.skyrain.software.website.utils.Json;
import com.skyrain.software.website.utils.MD5Util;
import com.skyrain.software.website.utils.RedisUtil;
import com.skyrain.software.website.utils.TextUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑层实现
 */
@Service("userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RedisUtil redisUtil;
    private static Logger logger = Logger.getLogger(UserServiceImp.class);

    @Override
    public Result queryAccount(String account) {
        if (TextUtil.isEmpty(account)) {
            return new Result(State.Code.REQUEST_CODE_402, State.Msg.REQUEST_MSG_402);
        }
        if (userDao.queryRepeatAccount(account) != null) {
            return new Result(State.Code.REQUEST_CODE_407, State.Msg.REQUEST_MSG_407);
        }
        return new Result();
    }

    @Override
    public Result queryName(String name) {
        if (TextUtil.isEmpty(name)) {
            return new Result(State.Code.REQUEST_CODE_402, State.Msg.REQUEST_MSG_402);
        }
        if (userDao.queryRepeatName(name) != null) {
            return new Result(State.Code.REQUEST_CODE_408, State.Msg.REQUEST_MSG_408);
        }
        return new Result();
    }

    @Override
    public Result signUp(String json) {
        if (TextUtil.isEmpty(json)) {
            return new Result(State.Code.REQUEST_CODE_404, State.Msg.REQUEST_MSG_404);
        }
        User user = (User) Json.toObject(json, User.class);
        if (!signDataInspect(user)) {
            return new Result(State.Code.REQUEST_CODE_402, State.Msg.REQUEST_MSG_402);
        }
        userDao.saveUser(user);
        return new Result();
    }

    @Override
    public Result signIn(String account, String password) {
        if (TextUtil.isEmpty(account)) {
            return new Result(State.Code.REQUEST_CODE_409, State.Msg.REQUEST_MSG_410);
        }
        if (TextUtil.isEmpty(password)) {
            return new Result(State.Code.REQUEST_CODE_410, State.Msg.REQUEST_MSG_410);
        }
        User user = userDao.queryUserByAccount(account);
        if (user == null) {
            return new Result(State.Code.REQUEST_CODE_411, State.Msg.REQUEST_MSG_411);
        }
        if (!user.getPassword().equals(password)) {
            return new Result(State.Code.REQUEST_CODE_412, State.Msg.REQUEST_MSG_412);
        }
        Result result = new Result();
        result.setToken(MD5Util.encode(account + password + System.currentTimeMillis()));
        result.setData(user);
        userDao.updateLastTime(account);
        return result;
    }

    /**
     * 参数完整性检查
     *
     * @param user 用户对象
     * @return 参数完整则返回true，不完整则返回false
     */
    private boolean signDataInspect(User user) {
        if (user == null) {
            return false;
        }
        if (TextUtil.isEmpty(user.getUserName())) {
            return false;
        }
        if (TextUtil.isEmpty(user.getAccount())) {
            return false;
        }
        if (TextUtil.isEmpty(user.getPassword())) {
            return false;
        }
        if (TextUtil.isEmpty(user.getInfo())) {
            return false;
        }
        if (user.getType() <= 0) {
            return false;
        }
        return true;
    }
}
