package com.hiro11.sms.service.impl;

import com.hiro11.sms.repository.StudentRepository;
import com.hiro11.sms.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
}
