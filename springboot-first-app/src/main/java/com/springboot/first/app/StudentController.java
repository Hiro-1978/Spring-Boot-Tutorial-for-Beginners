package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // http://localhost:8080/students
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

    // http://localhost:8080/student/1
    // @PathVariable annotation
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
