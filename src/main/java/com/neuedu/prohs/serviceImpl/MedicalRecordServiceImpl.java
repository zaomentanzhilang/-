package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.MedicalRecordMapper;
import com.neuedu.prohs.pojo.MedicalRecord;
import com.neuedu.prohs.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Autowired
    MedicalRecordMapper medicalRecordMapper;

    @Override
    @Transactional
    public boolean insertMedicalRecord(MedicalRecord medicalRecord, int[] dids) {

        int n = medicalRecordMapper.insertMedicalRecord(medicalRecord);

        int n2 = medicalRecordMapper.insertMedicalRecordDisease(medicalRecord.getId(), dids);
        if (n > 0 && n2 > 0) {
            return true;
        }
        return false;
    }
}
