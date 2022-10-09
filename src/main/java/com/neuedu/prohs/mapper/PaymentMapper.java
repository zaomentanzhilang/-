package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PaymentMapper {
    @Select("select * from payment")
    List<Payment> getPaymentList();
}
