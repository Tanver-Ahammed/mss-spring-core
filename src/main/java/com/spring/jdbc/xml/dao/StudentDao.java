package com.spring.jdbc.xml.dao;

import com.spring.jdbc.xml.entities.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(int studentId);

    Student getSingleStudent(int studentId);

    List<Student> getAllStudent();

}
