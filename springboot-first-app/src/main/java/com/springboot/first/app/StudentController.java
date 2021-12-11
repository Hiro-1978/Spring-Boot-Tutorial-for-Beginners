package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Paisan","Pompadech");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nick","Fury"));
        students.add(new Student("Clint","Barton"));
        students.add(new Student("Natasha","Romanov"));
        students.add(new Student("Stive","Roger"));
        students.add(new Student("Tony","Stark"));
        return students;
    }
}
