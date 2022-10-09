package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.RegisterMapper;
import com.neuedu.prohs.pojo.Register;
import com.neuedu.prohs.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterMapper registerMapper;


    @Override
    public List<Register> getRegisterList(int employyId, String caseNumber, String realName) {
        return registerMapper.getRegisterList(employyId, caseNumber, realName);
    }

    @Override
    public Boolean addRegister(Register onsite) {
//        UUID uuid=UUID.randomUUID();
//        uuid.toString().replace("-", "");
        onsite.setCaseNumber(new Date().getTime() + "");
        onsite.setVisitState(1);
        String t = onsite.getIsBook().indexOf("true") >= 0 ? "是" : "否";
        onsite.setIsBook(t);
        return registerMapper.addRegister(onsite);
    }
}
