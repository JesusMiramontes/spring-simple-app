package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This interface is responsible for data access
@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

}
