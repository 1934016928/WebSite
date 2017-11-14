package com.skyrain.software.website.entity;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class UserBean implements Serializable {
    private static final long serialVersionUID = 3953315359223744279L;
    private String userName;
    private String userPass;

    public UserBean(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
