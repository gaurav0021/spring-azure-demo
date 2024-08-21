package com.example.springbbotapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBbotApplication.class, args);
    }

    @GetMapping("/")
    public String entry() {
        return "Welcomes in Spring Boot Application";
    }
}
