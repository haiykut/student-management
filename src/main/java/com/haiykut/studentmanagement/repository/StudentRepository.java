package com.haiykut.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.haiykut.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
