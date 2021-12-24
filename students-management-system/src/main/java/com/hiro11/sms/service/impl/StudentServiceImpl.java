package com.hiro11.sms.service.impl;

import com.hiro11.sms.entity.Student;
import com.hiro11.sms.repository.StudentRepository;
import com.hiro11.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super(); //ไม่ต้องมีก็ได้
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student saveStudents(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getById(id);
    }
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
