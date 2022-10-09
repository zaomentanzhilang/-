package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.DiseaseMapper;
import com.neuedu.prohs.pojo.Disease;
import com.neuedu.prohs.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Autowired
    DiseaseMapper diseaseMapper;

    @Override
    public List<Disease> getDiseaseList(String dname, String dc, String icd) {
        return diseaseMapper.getDiseaseList(dname, dc, icd);
    }
}
