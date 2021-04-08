package com.ldx.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lidexin
 * @create 2021-03-28 11:42
 */
@SpringBootApplication
//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
public class PaymentMain80004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain80004.class,args);
    }
}
