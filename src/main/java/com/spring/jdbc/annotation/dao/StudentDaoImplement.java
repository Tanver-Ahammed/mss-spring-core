package com.spring.jdbc.annotation.dao;

import com.spring.jdbc.annotation.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoImplement implements StudentDao {

    @Autowired
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
        affectedRow = this.getJdbcTemplate().update("UPDATE  student SET name = ?, city = ? WHERE id = ?",
                student.getName(), student.getCity(), student.getId());
        return affectedRow;
    }

    @Override
    public int deleteStudent(int studentId) {
        int affectedRow = 0;
        affectedRow = this.getJdbcTemplate().update("DELETE FROM student WHERE id = ?",
                studentId);
        return affectedRow;
    }

    @Override
    public Student getSingleStudent(int studentId) {
        String sql = "SELECT * FROM student WHERE id = ?";
        RowMapper<Student>rowMapper = (rs, rowNum) -> {
            Student student1 = new Student(rs.getInt(1),
                    rs.getString(2), rs.getString(3));
            return student1;
        };
        return this.getJdbcTemplate().queryForObject(sql, rowMapper, studentId);
    }

    @Override
    public List<Student> getAllStudent() {
        String sql = "SELECT * FROM student";
        RowMapper<Student>rowMapper = (rs, rowNum) -> {
            Student student1 = new Student(rs.getInt(1),
                    rs.getString(2), rs.getString(3));
            return student1;
        };
        return this.getJdbcTemplate().query(sql, rowMapper);
    }
}
