package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.Register;
import com.neuedu.prohs.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @RequestMapping("/list")
    List<Register> getRegisterList(int employyId, String caseNumber, String realName) {
        return registerService.getRegisterList(employyId, caseNumber, realName);
    }

    @RequestMapping("/add")
    public boolean addRegisterList(Register onsite) {
        System.out.println(onsite);
        return registerService.addRegister(onsite);
    }
}
