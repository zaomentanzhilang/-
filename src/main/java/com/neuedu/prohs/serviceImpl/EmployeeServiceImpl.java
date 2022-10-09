package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.EmployeeMapper;
import com.neuedu.prohs.pojo.Employee;
import com.neuedu.prohs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public Employee getEmpInfo(String ename, String pwd) {
        return employeeMapper.getEmpInfo(ename, pwd);
    }

    @Override
    public List<Employee> getEmpInfoList() {
        return employeeMapper.getEmpInfoList();
    }

    @Override
    public List<Employee> getEmployeeList(int deptmentId, int registLevelId) {
        return employeeMapper.getEmployeeList(deptmentId, registLevelId);
    }


}
