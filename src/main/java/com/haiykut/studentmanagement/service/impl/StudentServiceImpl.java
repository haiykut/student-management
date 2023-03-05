package com.haiykut.studentmanagement.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.haiykut.studentmanagement.entity.Student;
import com.haiykut.studentmanagement.repository.StudentRepository;
import com.haiykut.studentmanagement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getallStudents() {
        return studentRepository.findAll();

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
