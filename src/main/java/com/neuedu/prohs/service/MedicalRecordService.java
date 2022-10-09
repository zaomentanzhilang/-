package com.neuedu.prohs.service;

import com.neuedu.prohs.pojo.MedicalRecord;


public interface MedicalRecordService {

    boolean insertMedicalRecord(MedicalRecord medicalRecord, int[] dids);
}
