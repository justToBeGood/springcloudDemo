package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class PaymentFallback implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return "----paymentInfo_OK fallback-----";
    }


    @Override
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return "----paymentInfo_TimeOut fallback-----";
    }
}
