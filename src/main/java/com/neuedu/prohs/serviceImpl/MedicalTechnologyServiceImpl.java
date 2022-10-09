package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.MedicalTechnologyMapper;
import com.neuedu.prohs.pojo.MedicalTechnology;
import com.neuedu.prohs.service.MedicalTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalTechnologyServiceImpl implements MedicalTechnologyService {
    @Autowired
    MedicalTechnologyMapper medicalTechnologyMapper;


    @Override
    public List<MedicalTechnology> getMedTech(String techName, String techCode) {
        return medicalTechnologyMapper.getMedTech(techName, techCode);
    }
}
