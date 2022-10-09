package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.PaymentMapper;
import com.neuedu.prohs.pojo.Payment;
import com.neuedu.prohs.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public List<Payment> getPaymentList() {
        return paymentMapper.getPaymentList();
    }
}
