package com.example.Postgresql.AOS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
            "model"
            })
@EnableJpaRepositories(basePackages = {
            "repository"
            })
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
