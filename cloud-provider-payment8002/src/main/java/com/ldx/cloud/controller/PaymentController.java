package com.ldx.cloud.controller;

import com.ldx.cloud.entity.CommonResult;
import com.ldx.cloud.entity.PayMent;
import com.ldx.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lidexin
 * @create 2021-03-15 12:50
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody PayMent payMent) {
        int i = paymentService.create(payMent);
        log.info("***插入结果***：" + i);
        if(i > 0) {
            return new CommonResult(200,"插入成功;serverPort:"+serverPort,i);
        }
        else {
            return new CommonResult(444,"插入失败",null);
        }
    }



    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        PayMent i = paymentService.getPaymentById(id);
        log.info("***插入结果***：" + i);
        if(i !=null) {
            return new CommonResult(200,"查询成功;serverPort:"+serverPort,i);
        }
        else {
            return new CommonResult(444,"查询不到记录，记录id:"+id,null);
        }
    }
}
