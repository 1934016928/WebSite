package com.skyrain.software.website.service;

import com.skyrain.software.website.entity.UserBean;

/**
 * 业务逻辑层接口
 */
public interface UserService {

    /*添加用户*/
    void addUser(UserBean userBean);
}