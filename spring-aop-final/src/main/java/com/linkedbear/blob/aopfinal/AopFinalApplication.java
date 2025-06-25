package com.linkedbear.blob.aopfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class AopFinalApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(AopFinalApplication.class, args);
    }
}
