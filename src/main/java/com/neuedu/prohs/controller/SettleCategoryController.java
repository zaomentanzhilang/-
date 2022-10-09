package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.SettleCategory;
import com.neuedu.prohs.service.SettleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/set")
public class SettleCategoryController {
    @Autowired
    SettleCategoryService settleCategoryService;

    @RequestMapping("/list")
    public List<SettleCategory> getSettleCategoryList() {
        return settleCategoryService.getSettleCategoryList();
    }
}
