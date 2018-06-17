package com.sky.software.scp.dao;

import com.sky.software.scp.entity.User;

/**
 * 用户数据持久层
 */
public interface UserDao {

    /**
     * 创建用户
     *
     * @param user 用户对象
     */
    void cUser(User user);

    /**
     * 查询用户
     *
     * @param user 用户对象
     * @return 如果查询到用户则返回一个用户对象, 未查询到则返回null
     */
    User qUser(User user);

    /**
     * 删除用户
     *
     * @param user 用户对象
     */
    void dUser(User user);

    /**
     * 修改用户
     *
     * @param user 用户对象
     */
    void uUser(User user);
}
