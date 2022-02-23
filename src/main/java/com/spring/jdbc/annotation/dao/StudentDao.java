package com.spring.jdbc.annotation.dao;

import com.spring.jdbc.annotation.entities.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(int studentId);

    Student getSingleStudent(int studentId);

    List<Student> getAllStudent();

}
