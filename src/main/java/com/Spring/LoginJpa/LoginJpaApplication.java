package com.Spring.LoginJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LoginJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginJpaApplication.class, args);
    }

}
