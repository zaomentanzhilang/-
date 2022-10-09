package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.Employee;
import com.neuedu.prohs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/login")
    public Employee getEmpInfo(String ename, String pwd) {
        return employeeService.getEmpInfo(ename, pwd);
    }

    @RequestMapping("/list")
    List<Employee> getEmpInfoList() {
        return employeeService.getEmpInfoList();
    }

    @RequestMapping("/Dlist")
    public List<Employee> getEmployeeList(int deptmentId, int registLevelId) {
        return employeeService.getEmployeeList(deptmentId, registLevelId);
    }
}
