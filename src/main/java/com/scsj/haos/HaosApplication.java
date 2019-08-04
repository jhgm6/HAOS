package com.scsj.haos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.scsj.haos.mapper"})
public class HaosApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaosApplication.class, args);
    }

}
