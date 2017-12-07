package com.skyrain.software.website.controller;

import com.skyrain.software.website.entity.result.Result;
import com.skyrain.software.website.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户相关部分控制器
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    private static Logger logger = Logger.getLogger(UserController.class);

    /**
     * 检查用户账户是否有重复
     *
     * @param account 用户账户
     * @return 返回操作信息
     */
    @RequestMapping(method = RequestMethod.POST, value = "/queryAccount")
    @ResponseBody
    public Result queryAccount(String account) {
        return userService.queryAccount(account);
    }

    /**
     * 检查昵称是否可用
     *
     * @param name 用户名
     * @return 返回操作信息
     */
    @RequestMapping(method = RequestMethod.POST, value = "/queryName")
    @ResponseBody
    public Result queryName(String name) {
        return userService.queryName(name);
    }

    /**
     * 用户注册接口
     *
     * @param json JSON数据
     * @return 返回操作信息
     */
    @RequestMapping(method = RequestMethod.POST, value = "/signUp")
    @ResponseBody
    public Result signUp(@RequestBody String json) {
        return userService.signUp(json);
    }

    /**
     * 用户登陆接口
     *
     * @param account  登陆账户
     * @param password 登陆密码
     * @return 返回操作信息
     */
    @RequestMapping(method = RequestMethod.POST, value = "/signIn")
    @ResponseBody
    public Result signIn(String account, String password) {
        return userService.signIn(account, password);
    }
}
