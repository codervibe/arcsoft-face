package com.itboyst.facedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan({"com.itboyst.facedemo.dao.mapper","com.itboyst.facedemo.mapper"})
@EnableTransactionManagement
public class ArcSoftFaceDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArcSoftFaceDemoApplication.class, args);
    }
}

