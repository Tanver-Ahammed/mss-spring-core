package com.spring.jdbc.xml.dao;

import com.spring.jdbc.xml.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImplement implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertStudent(Student student) {
        int affectedRow = 0;
        affectedRow = this.getJdbcTemplate().update("INSERT INTO student VALUES (?, ?, ?)",
                student.getId(), student.getName(), student.getCity());
        return affectedRow;
    }

    @Override
    public int updateStudent(Student student) {
        int affectedRow = 0;
        affectedRow = this.getJdbcTemplate().update("UPDATE student SET name = ?, city = ? WHERE id = ?",
                student.getName(), student.getCity(), student.getId());
        return affectedRow;
    }

    @Override
    public int deleteStudent(int studentId) {
        int affectedRow = 0;
        affectedRow = this.getJdbcTemplate().update("DELETE FROM student WHERE id = ?", studentId);
        return affectedRow;
    }

    @Override
    public Student getSingleStudent(int studentId) {
        String sql = "SELECT * FROM student WHERE id = ?";
        RowMapper<Student> rowMapper = (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setCity(rs.getString(3));
            return student;
        };
        Student student = null;
        student = this.getJdbcTemplate().queryForObject(sql, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        String sql = "SELECT * FROM student";
        RowMapper<Student> rowMapper = (rs, rowNum) -> {
            Student student = new Student(rs.getInt(1),
                    rs.getString(2), rs.getString(3));
            return student;
        };
        List<Student> students = this.getJdbcTemplate().query(sql, rowMapper);
        return students;
    }
}