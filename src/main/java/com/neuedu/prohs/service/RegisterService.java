package com.neuedu.prohs.service;

import com.neuedu.prohs.pojo.Register;

import java.util.List;

public interface RegisterService {
    List<Register> getRegisterList(int employyId, String caseNumber, String realName);

    Boolean addRegister(Register onsite);
}
