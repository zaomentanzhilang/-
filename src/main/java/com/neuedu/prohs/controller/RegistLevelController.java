package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.RegistLevel;
import com.neuedu.prohs.service.RegistLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/reg")
public class RegistLevelController {
    @Autowired
    RegistLevelService registLevelService;

    @RequestMapping("/list")
    public List<RegistLevel> getRegistLevelList() {
        return registLevelService.getRegistLevelList();
    }
}
