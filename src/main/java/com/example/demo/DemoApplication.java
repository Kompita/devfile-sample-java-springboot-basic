package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        Map<String,String> env =  System.getenv();
        String myenv = System.getenv("DATASOURCE_URL") + " - " + System.getenv("DATASOURCE_USR");
        return "ENVIRONMENT: " + myenv;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);        
    }

}
