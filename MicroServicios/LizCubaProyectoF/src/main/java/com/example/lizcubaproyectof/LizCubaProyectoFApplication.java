package com.example.lizcubaproyectof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LizCubaProyectoFApplication {

    public static void main(String[] args) {
        SpringApplication.run(LizCubaProyectoFApplication.class, args);
    }

}
