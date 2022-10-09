package com.neuedu.prohs.service;

import com.neuedu.prohs.pojo.InspectionRequest;

public interface InspectionRequestService {

    boolean inspectionRequest(InspectionRequest inspectionRequest, int[] tids, int id);

}
