package com.orm.learningorm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningOrmApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LearningOrmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("working from project ");
        System.out.println("change 1 ");
    }
}
