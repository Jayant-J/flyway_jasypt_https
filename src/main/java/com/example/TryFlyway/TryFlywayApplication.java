package com.example.TryFlyway;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class TryFlywayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TryFlywayApplication.class, args);
    }
}
