package com.neuedu.prohs;

import com.neuedu.prohs.mapper.DiseaseMapper;
import com.neuedu.prohs.pojo.MedicalRecord;
import com.neuedu.prohs.service.MedicalRecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired(required = false)
    DiseaseMapper diseaseMapper;
    @Autowired
    MedicalRecordService medicalRecordService;

    @Test
    void contextLoads() {
        MedicalRecord m = new MedicalRecord();
        m.setId(1);
        int[] arr = {1, 2};
        medicalRecordService.insertMedicalRecord(m, arr);
    }
}
