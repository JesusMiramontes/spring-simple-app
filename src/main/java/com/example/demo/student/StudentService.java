package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Mairam",
                        "mariam@gmail.com",
                        LocalDate.of(1995, Month.APRIL, 15),
                        21),
                new Student(1L,
                        "Joseph",
                        "Joseph@gmail.com",
                        LocalDate.of(1995, Month.DECEMBER, 15),
                        21)
        );
    }

}
