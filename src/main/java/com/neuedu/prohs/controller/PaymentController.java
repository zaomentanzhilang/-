package com.neuedu.prohs.controller;

import com.neuedu.prohs.pojo.Payment;
import com.neuedu.prohs.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @RequestMapping("/list")
    public List<Payment> getPaymentList() {
        return paymentService.getPaymentList();
    }
}
