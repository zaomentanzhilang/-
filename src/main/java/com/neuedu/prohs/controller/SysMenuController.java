package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.SysMenu;
import com.neuedu.prohs.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/menu")
public class SysMenuController {
    @Autowired
    SysMenuService service;

    @RequestMapping("/list")
    public List<SysMenu> getMenuInfo(int roleId) {
        return service.getSysMenuList(roleId);
    }
}
