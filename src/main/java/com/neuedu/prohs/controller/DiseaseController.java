package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.Disease;
import com.neuedu.prohs.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/disease")
public class DiseaseController {
    int TotalRow;
    @Autowired
    DiseaseService diseaseService;

    @RequestMapping("/list")
    public List<Disease> getDiseaseList(int ps, Integer cur, String dname, String dc, String icd) {
        List<Disease> list = diseaseService.getDiseaseList(dname, dc, icd);
        this.TotalRow = list.size();
        int f = (cur - 1) * ps;
        int t = cur * ps;
        List<Disease> sublist = list.subList(f, t);
        return sublist;

    }

    @RequestMapping("/TotalRow")
    public int TotalRow() {
        return this.TotalRow;
    }
}
