package com.example.springtest001;

import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Springtest001Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Springtest001Application.class, args);
    }

}
