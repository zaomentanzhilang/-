package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.InspectionRequest;
import com.neuedu.prohs.service.InspectionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/InspectionRequest")
@CrossOrigin
public class InspectionRequestController {
    @Autowired
    InspectionRequestService inspectionRequestService;

    @RequestMapping("/insert")
    public boolean insert(InspectionRequest inspectionRequest, int[] tids, int id) {
        return inspectionRequestService.inspectionRequest(inspectionRequest, tids, id);
    }

}
