package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.DepartmentMapper;
import com.neuedu.prohs.pojo.Department;
import com.neuedu.prohs.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartment() {
        return departmentMapper.getDepartment();
    }

}
