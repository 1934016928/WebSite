package com.skyrain.software.website.entity;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {

    private static final long serialVersionUID = 3953315359223744279L;
    /*数据ID*/
    private int id;
    /*用户名*/
    private String userName;
    /*账户*/
    private String account;
    /*密码*/
    private String password;
    /*年龄*/
    private int age;
    /*性别*/
    private boolean sex;
    /*学历*/
    private String education;
    /*职位*/
    private String job;
    /*工作年限*/
    private int workLife;
    /*手机号*/
    private String phone;
    /*邮箱*/
    private String email;
    /*QQ号码*/
    private String QQ;
    /*微信号*/
    private String WX;
    /*用户头像存放路径*/
    private String head;
    /*用户类型*/
    private int type;
    /*用户个人信息描述*/
    private String info;
    /*用户技能等级*/
    private String skill;
    /*账户余额*/
    private double money;
    /*账户积分*/
    private double integral;
    /*提现渠道*/
    private String canal;
    /*是否绑定手机号*/
    private boolean phoneBind;
    /*用户资料完成度*/
    private int process;
    /*是否通过平台认证*/
    private boolean auth;
    /*账户创建时间*/
    private String createTime;
    /*最后一次登陆时间*/
    private String lastOnline;
    /*是否管理员*/
    private boolean admin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getWorkLife() {
        return workLife;
    }

    public void setWorkLife(int workLife) {
        this.workLife = workLife;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWX() {
        return WX;
    }

    public void setWX(String WX) {
        this.WX = WX;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getIntegral() {
        return integral;
    }

    public void setIntegral(double integral) {
        this.integral = integral;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public boolean isPhoneBind() {
        return phoneBind;
    }

    public void setPhoneBind(boolean phoneBind) {
        this.phoneBind = phoneBind;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(String lastOnline) {
        this.lastOnline = lastOnline;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
