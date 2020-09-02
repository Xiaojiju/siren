package com.summer.siren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.summer")
public class SirenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SirenApplication.class, args);
    }
}
