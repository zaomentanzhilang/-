package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.InspectionRequestMapper;
import com.neuedu.prohs.pojo.InspectionRequest;
import com.neuedu.prohs.service.InspectionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InspectionRequestServiceImpl implements InspectionRequestService {
    @Autowired
    InspectionRequestMapper inspectionRequestMapper;

    @Override
    @Transactional
    public boolean inspectionRequest(InspectionRequest inspectionRequest, int[] tids, int id) {
        int n1 = inspectionRequestMapper.inspectionRequest(inspectionRequest);
        int n2 = inspectionRequestMapper.insertInspectionAccount(inspectionRequest.getId(), tids);
        int n3 = inspectionRequestMapper.updateVisitStat(id);
        if (n1 > 0 && n2 > 0 && n3 > 0) {
            return true;
        }
        return false;
    }

}
