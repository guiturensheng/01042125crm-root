package com.qy25.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Aaron
 * @Date: 2021/1/4 21:20
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.qy25.sm.mapper")
@EnableTransactionManagement
public class AAAA {
    public static void main(String[] args) {
        SpringApplication.run(AAAA.class);
    }
}
