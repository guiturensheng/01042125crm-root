package com.qy25.sm.page;

import lombok.Data;

import java.util.List;

/**
 * @Author: Aaron
 * @Date: 2020/12/22 11:35
 * @Description:
 */
@Data
public class PageVo<T> {
    private long total;
    private List<T> list ;


}
