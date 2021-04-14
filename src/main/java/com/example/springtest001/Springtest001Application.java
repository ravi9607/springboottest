package com.example.springtest001;

import ch.qos.logback.core.db.dialect.PostgreSQLDialect;
import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Springtest001Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Springtest001Application.class, args);
    }

}
