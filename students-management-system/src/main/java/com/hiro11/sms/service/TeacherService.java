package com.hiro11.sms.service;

import com.hiro11.sms.entity.Teacher;

import java.util.List;

public interface TeacherService {
        List<Teacher> getAllTeachers();
        Teacher saveTeachers(Teacher teacher);
        Teacher getTeacherById(Long id);
        Teacher updateTeacher(Teacher teacher);
        void deleteTeacherById(Long id);
}
