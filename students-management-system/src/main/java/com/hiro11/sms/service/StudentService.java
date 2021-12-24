package com.hiro11.sms.service;

import com.hiro11.sms.entity.Student;

import java.util.List;

public interface StudentService {
        List<Student> getAllStudents();
        Student saveStudents(Student student);
        Student getStudentById(Long id);
        Student updateStudent(Student student);
}
