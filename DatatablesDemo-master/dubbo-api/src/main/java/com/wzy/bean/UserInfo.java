package com.wzy.bean;

import java.io.Serializable;

public class UserInfo implements Serializable{
    private  int id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String pas;

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

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }
}
