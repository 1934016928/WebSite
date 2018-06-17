package com.sky.software.scp.service;

import com.sky.software.scp.entity.result.Result;

/**
 * 业务逻辑层接口
 */
public interface UserService {

    /*用户账户查询*/
    Result qAccount(String json);

    /*用户注册*/
    Result signUp(String json);

    /*用户登录*/
    Result signIn(String json);

    /*获取验证码*/
    Result verifyCode(String json);

    /*验证手机号*/
    Result verifyPhone(String json);

    /*验证用户*/
    Result verifyUser(String json);

    /*更新用户账户*/
    Result updateUser(String json);

    /*删除用户*/
    Result deleteUser(String json);
}
