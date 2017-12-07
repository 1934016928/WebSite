package com.skyrain.software.website.dao;

import com.skyrain.software.website.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 用户数据持久层
 */
@Repository("userDao")
public interface UserDao {

    /*保存用户*/
    void saveUser(User user);

    /*通过账户查询账户(用于账户重复判断)*/
    String queryRepeatAccount(String account);

    /*通过昵称查询昵称(用于账户重复判断)*/
    String queryRepeatName(String name);

    /*更新用户最后一次登陆时间*/
    void updateLastTime(String account);

    /*根据账户查询用户*/
    User queryUserByAccount(String account);
}
