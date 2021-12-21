package com.hiro11.sms.controller;

import com.hiro11.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    // Handler method to handle list students and return mod and view

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

}
