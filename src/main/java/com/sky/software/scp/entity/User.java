package com.sky.software.scp.entity;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {

    /*自增长ID*/
    private int id;
    /*用户昵称*/
    private String uName;
    /*用户账户*/
    private String uAccount;
    /*用户密码*/
    private String uPassword;
    /*创建时间*/
    private String cTime;
    /*用户唯一标识*/
    private String uKey;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public String getuKey() {
        return uKey;
    }

    public void setuKey(String uKey) {
        this.uKey = uKey;
    }
}
