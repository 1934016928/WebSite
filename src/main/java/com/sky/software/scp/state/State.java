package com.sky.software.scp.state;

/**
 * 通用返回状态码及消息
 */
public class State {
    /*状态码*/
    public class Code {
        /*请求成功*/
        public static final int REQUEST_CODE_200 = 200;
        /*用户未登录*/
        public static final int REQUEST_CODE_401 = 401;
        /*请求缺少部分必要字段*/
        public static final int REQUEST_CODE_402 = 402;
        /*当前用户无权限操作*/
        public static final int REQUEST_CODE_403 = 403;
        /*数据未找到*/
        public static final int REQUEST_CODE_404 = 404;
        /*请求方式错误*/
        public static final int REQUEST_CODE_405 = 405;
        /*该用户已下线*/
        public static final int REQUEST_CODE_406 = 406;
        /*该用户账户已存在*/
        public static final int REQUEST_CODE_407 = 407;
        /*昵称已存在*/
        public static final int REQUEST_CODE_408 = 408;
        /*用户账户为空*/
        public static final int REQUEST_CODE_409 = 409;
        /*用户密码为空*/
        public static final int REQUEST_CODE_410 = 410;
        /*用户不存在*/
        public static final int REQUEST_CODE_411 = 411;
        /*用户密码错误*/
        public static final int REQUEST_CODE_412 = 412;
        /*服务器内部错误*/
        public static final int REQUEST_CODE_501 = 501;
        /*服务器处理超时*/
        public static final int REQUEST_CODE_502 = 502;
        /*当前服务器不可用*/
        public static final int REQUEST_CODE_503 = 503;
    }

    /*消息*/
    public class Msg {
        /*请求成功*/
        public static final String REQUEST_MSG_200 = "操作成功!";
        /*用户未登录*/
        public static final String REQUEST_MSG_401 = "请登陆后操作!";
        /*请求缺少部分必要字段*/
        public static final String REQUEST_MSG_402 = "请检查参数后重新传递!";
        /*当前用户无权限操作*/
        public static final String REQUEST_MSG_403 = "权限不允许!";
        /*数据未找到*/
        public static final String REQUEST_MSG_404 = "未找到数据!";
        /*请求方式错误*/
        public static final String REQUEST_MSG_405 = "请更换请求方式后重试!";
        /*该用户已下线*/
        public static final String REQUEST_MSG_406 = "用户已下线,请重新登陆!";
        /*该用户账户已存在*/
        public static final String REQUEST_MSG_407 = "用户账户已存在!";
        /*昵称已存在*/
        public static final String REQUEST_MSG_408 = "该昵称已存在!";
        /*账户为空*/
        public static final String REQUEST_MSG_409 = "账户不能为空!";
        /*密码为空*/
        public static final String REQUEST_MSG_410 = "密码不能为空!";
        /*用户不存在*/
        public static final String REQUEST_MSG_411 = "用户不存在!";
        /*密码错误*/
        public static final String REQUEST_MSG_412 = "密码错误!";
        /*服务器内部错误*/
        public static final String REQUEST_MSG_501 = "服务器内部错误!";
        /*服务器处理超时*/
        public static final String REQUEST_MSG_502 = "服务器返回处理超时!";
        /*当前服务器不可用*/
        public static final String REQUEST_MSG_503 = "服务器不可用!";
    }
}
