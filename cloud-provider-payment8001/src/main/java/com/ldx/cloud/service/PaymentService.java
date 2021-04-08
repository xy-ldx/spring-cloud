package com.ldx.cloud.service;

import com.ldx.cloud.entity.PayMent;
import org.apache.ibatis.annotations.Param;

/**
 * @author lidexin
 * @create 2021-03-15 12:45
 */
public interface PaymentService {
    public int create(PayMent payMent);

    public PayMent getPaymentById(@Param("id") Long id);

}
