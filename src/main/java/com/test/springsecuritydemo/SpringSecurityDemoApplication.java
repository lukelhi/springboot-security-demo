package com.test.springsecuritydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringSecurityDemoApplication {
    public static void main(String[] args)

    {
        SpringApplication.run(SpringSecurityDemoApplication.class, args);
    }
}
