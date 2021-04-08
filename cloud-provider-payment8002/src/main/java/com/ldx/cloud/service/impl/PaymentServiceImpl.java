package com.ldx.cloud.service.impl;

import com.ldx.cloud.dao.PaymentDao;
import com.ldx.cloud.entity.PayMent;
import com.ldx.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lidexin
 * @create 2021-03-15 12:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {


    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(PayMent payMent) {
        return paymentDao.create(payMent);
    }

    @Override
    public PayMent getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
