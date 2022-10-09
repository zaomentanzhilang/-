package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.MedicalTechnology;
import com.neuedu.prohs.service.MedicalTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Technology")
public class MedicalTechnologyController {
    @Autowired
    MedicalTechnologyService medicalTechnologyService;
    int TotalRow;

    @RequestMapping("/list")
    public List<MedicalTechnology> getMedTech(int ps, int cur, String techName, String techCode) {
        List<MedicalTechnology> list = medicalTechnologyService.getMedTech(techName, techCode);
        this.TotalRow = list.size();
        int f = (cur - 1) * ps;
        int t = cur * ps;
        List<MedicalTechnology> sublist = list.subList(f, t);
        System.out.println(sublist.toString());
        return sublist;

    }

    @RequestMapping("/TotalRow")
    public int TotalRow() {
        return this.TotalRow;
    }
}
