package com.mysite.jangsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JangsuApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(JangsuApplication.class, args);
    }
}