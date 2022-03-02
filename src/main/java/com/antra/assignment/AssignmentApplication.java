package com.antra.assignment;

import com.antra.assignment.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class AssignmentApplication {

    @Bean
    public Map<Integer, Product> productStorage() {
        return new HashMap<Integer, Product>();
    }

    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class, args);
    }

}
