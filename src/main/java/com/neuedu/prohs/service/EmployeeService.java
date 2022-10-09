package com.neuedu.prohs.service;

import com.neuedu.prohs.pojo.Employee;

import java.util.List;


public interface EmployeeService {

    Employee getEmpInfo(String ename, String pwd);

    List<Employee> getEmpInfoList();

    List<Employee> getEmployeeList(int deptmentId, int registLevelId);
}
