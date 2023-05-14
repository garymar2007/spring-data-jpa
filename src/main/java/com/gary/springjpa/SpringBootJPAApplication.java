package com.gary.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJPAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJPAApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args ->{
            studentRepository.save(new Student("Gary", "Ma", "gary.ma@gmail.com", 47));
        };
    }

}
