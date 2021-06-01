package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository studentRepository){
        return args -> {

            Student alexandra = new Student(
                "Alexandra",
                "Alexandra@gmail.com",
                LocalDate.of(1995, APRIL, 15)
            );

            Student sophie = new Student(
                    "Sophie",
                    "Sophie@gmail.com",
                    LocalDate.of(1982, MAY, 15)
            );

            studentRepository.saveAll(
                List.of(alexandra, sophie)
            );

        };
    }
}
