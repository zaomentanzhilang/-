package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.RegistLevelMapper;
import com.neuedu.prohs.pojo.RegistLevel;
import com.neuedu.prohs.service.RegistLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistLevelServiceImpl implements RegistLevelService {
    @Autowired
    RegistLevelMapper registLevelMapper;

    @Override
    public List<RegistLevel> getRegistLevelList() {
        return registLevelMapper.getRegistLevelList();
    }
}
