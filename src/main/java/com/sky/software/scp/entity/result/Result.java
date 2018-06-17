package com.sky.software.scp.entity.result;

import com.sky.software.scp.state.State;

import java.io.Serializable;

/**
 * 通用返回对象
 */
public class Result implements Serializable {

    /*返回状态码,此状态码参照state包下的State类*/
    private int code;
    /*返回提示信息,此提示信息参照state包下的State对应字符串*/
    private String msg;
    /*返回服务器当前时间*/
    private long time;
    /*返回用户登陆后的token,没有token的时候为null*/
    private String token;
    /*返回请求结果数据集,没有数据集则为null*/
    private Object data;

    public Result() {
        this(State.Code.REQUEST_CODE_200, State.Msg.REQUEST_MSG_200);
    }

    public Result(int code, String msg, String token, Object data) {
        this.code = code;
        this.msg = msg;
        this.time = System.currentTimeMillis();
        this.token = token;
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.time = System.currentTimeMillis();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
