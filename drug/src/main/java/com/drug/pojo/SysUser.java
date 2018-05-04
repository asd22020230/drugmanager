package com.drug.pojo;

public class SysUser {
    private Integer sysuserId;

    private String account;

    private String password;

    private String userstate;

    private Integer userpicture;

    public Integer getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(Integer sysuserId) {
        this.sysuserId = sysuserId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate == null ? null : userstate.trim();
    }

    public Integer getUserpicture() {
        return userpicture;
    }

    public void setUserpicture(Integer userpicture) {
        this.userpicture = userpicture;
    }
}