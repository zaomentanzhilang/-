package com.neuedu.prohs.service;

import com.neuedu.prohs.pojo.Disease;

import java.util.List;

public interface DiseaseService {
    List<Disease> getDiseaseList(String dname, String dc, String icd);
}
