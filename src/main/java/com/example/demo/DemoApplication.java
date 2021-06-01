package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController // Makes this class to server endpoints
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "Hello";
//	}

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
