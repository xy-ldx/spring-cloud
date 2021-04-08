package com.ldx.cloud.controller;

import com.ldx.cloud.entity.CommonResult;
import com.ldx.cloud.entity.PayMent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lidexin
 * @create 2021-03-20 21:52
 */
@RestController
@Slf4j
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult<PayMent> create(PayMent payMent) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payMent,CommonResult.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<PayMent> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id,CommonResult.class);
    }

}
