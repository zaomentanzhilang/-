package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.Department;
import com.neuedu.prohs.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/dep")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/list")
    public List<Department> getDepartmentList() {
        return departmentService.getDepartment();
    }

}
