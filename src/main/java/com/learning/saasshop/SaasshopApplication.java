package com.learning.saasshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;
@EnableSwagger2
@MapperScan("com.learning.saasshop.mapper")
@SpringBootApplication
public class SaasshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaasshopApplication.class, args);
    }

}
