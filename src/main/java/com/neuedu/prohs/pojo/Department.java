package com.neuedu.prohs.pojo;


import java.util.List;

public class Department {

    private int id;
    private String deptCode;
    private String deptName;
    private String deptType;
    private int delmark;
    private List<Employee> employeeListList;

    public List<Employee> getEmployeeListList() {
        return employeeListList;
    }

    public void setEmployeeListList(List<Employee> employeeListList) {
        this.employeeListList = employeeListList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public int getDelmark() {
        return delmark;
    }

    public void setDelmark(int delmark) {
        this.delmark = delmark;
    }
}
