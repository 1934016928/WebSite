package com.skyrain.software.website.service;

import com.skyrain.software.website.entity.result.Result;

/**
 * 业务逻辑层接口
 */
public interface UserService {

    /*用户账户查重*/
    Result queryAccount(String account);

    /*用户昵称查重*/
    Result queryName(String name);

    /*用户注册*/
    Result signUp(String json);

    /*用户登陆方法*/
    Result signIn(String account, String password);
}
