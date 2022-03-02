package com.antra.assignment;

import com.antra.assignment.domain.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AssignmentApplication {

    @Bean
//            (name = "ProductStorage")
    public Map<Integer, Product> productStorage() {
        return new HashMap<Integer, Product>();
    }

    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class, args);
    }

}
