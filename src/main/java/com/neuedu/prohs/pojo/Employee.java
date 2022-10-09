package com.neuedu.prohs.pojo;


public class Employee {

    private int id;
    private String realname;
    private String password;
    private int deptmentId;
    private int registLevelId;
    private int schedulingId;
    private int delmark;
    private int roleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(int deptmentId) {
        this.deptmentId = deptmentId;
    }

    public int getRegistLevelId() {
        return registLevelId;
    }

    public void setRegistLevelId(int registLevelId) {
        this.registLevelId = registLevelId;
    }

    public int getSchedulingId() {
        return schedulingId;
    }

    public void setSchedulingId(int schedulingId) {
        this.schedulingId = schedulingId;
    }

    public int getDelmark() {
        return delmark;
    }

    public void setDelmark(int delmark) {
        this.delmark = delmark;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
