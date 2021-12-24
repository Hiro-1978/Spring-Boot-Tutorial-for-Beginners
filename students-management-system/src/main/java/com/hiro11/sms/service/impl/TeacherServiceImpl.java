package com.hiro11.sms.service.impl;

import com.hiro11.sms.entity.Teacher;
import com.hiro11.sms.repository.TeacherRepository;
import com.hiro11.sms.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        super();
        this.teacherRepository = teacherRepository;
    }
    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
    @Override
    public Teacher saveTeachers(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepository.getById(id);
    }
    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
    @Override
    public void deleteTeacherById(Long id) {
        teacherRepository.deleteById(id);
    }

}
