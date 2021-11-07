package ru.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringRestaurantApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringRestaurantApplication.class);
    }
}
