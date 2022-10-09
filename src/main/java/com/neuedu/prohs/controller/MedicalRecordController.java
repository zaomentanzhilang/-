package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.MedicalRecord;
import com.neuedu.prohs.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/Record")
public class MedicalRecordController {
    @Autowired
    MedicalRecordService medicalRecordService;

    @RequestMapping("/insert")
    public boolean insert(MedicalRecord medicalRecord, int[] dids) {
        return medicalRecordService.insertMedicalRecord(medicalRecord, dids);
    }

}
