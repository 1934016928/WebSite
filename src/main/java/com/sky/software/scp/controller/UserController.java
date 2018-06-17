package com.sky.software.scp.controller;

import com.sky.software.scp.entity.result.Result;
import com.sky.software.scp.service.UserService;
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
@RequestMapping(method = RequestMethod.POST, value = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @RequestMapping(value = "/VerifyAccount")
    public Result verifyAccount(@RequestBody String json) {
        return userService.qAccount(json);
    }
}
