package com.ldx.cloud.dao;

import com.ldx.cloud.entity.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lidexin
 * @create 2021-03-15 12:35
 */
@Mapper
public interface PaymentDao {
    public int create(PayMent payMent);

    public PayMent getPaymentById(@Param("id") Long id);
}
