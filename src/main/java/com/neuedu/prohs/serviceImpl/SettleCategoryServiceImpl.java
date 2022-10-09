package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.SettleCategoryMapper;
import com.neuedu.prohs.pojo.SettleCategory;
import com.neuedu.prohs.service.SettleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettleCategoryServiceImpl implements SettleCategoryService {
    @Autowired
    SettleCategoryMapper settleCategoryMapper;

    @Override
    public List<SettleCategory> getSettleCategoryList() {
        return settleCategoryMapper.getSettleCategoryList();
    }
}
