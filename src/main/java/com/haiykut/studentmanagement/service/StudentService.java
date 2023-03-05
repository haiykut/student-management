package com.haiykut.studentmanagement.service;

import java.util.List;

import com.haiykut.studentmanagement.entity.Student;

public interface StudentService {
    List<Student> getallStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
