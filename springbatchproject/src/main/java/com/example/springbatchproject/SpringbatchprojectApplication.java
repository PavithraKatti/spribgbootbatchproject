package com.example.springbatchproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Scanner;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbatchprojectApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbatchprojectApplication.class, args);
    }
}
