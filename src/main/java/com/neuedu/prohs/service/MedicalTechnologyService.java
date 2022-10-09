package com.neuedu.prohs.service;

import com.neuedu.prohs.pojo.MedicalTechnology;

import java.util.List;

public interface MedicalTechnologyService {
    List<MedicalTechnology> getMedTech(String techName, String techCode);
}
