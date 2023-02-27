package com.example.csa_spingboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.csa_spingboot.mapper")
public class CsaSpingbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsaSpingbootApplication.class, args);
    }

}
