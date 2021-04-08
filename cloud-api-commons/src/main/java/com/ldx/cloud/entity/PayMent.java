package com.ldx.cloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lidexin
 * @create 2021-03-15 12:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayMent implements Serializable {
    private Long id;
    private String serial;
}
