package com.qy25.sm.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Aaron
 * @Date: 2021/1/2 14:17
 * @Description:
 */
@Data
public class BaseEntity {
    private Long id;

    private Date addTime;

    private Long createrId;

    private Date updateTime;

    private Long updateId;
}
