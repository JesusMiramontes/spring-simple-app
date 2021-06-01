package com.example.demo.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student") // Set route
public class StudentController {

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(1L,
                        "Mairam",
                        "mariam@gmail.com",
                        LocalDate.of(1995, 1, 15),
                        21),
                new Student(1L,
                        "Joseph",
                        "Joseph@gmail.com",
                        LocalDate.of(1995, 2, 15),
                        21)
        );
    }
}
