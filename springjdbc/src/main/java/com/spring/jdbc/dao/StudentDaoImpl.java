package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		//insert query
    	String query = "insert into student(id, name, city) values(?, ?, ?)";
    	int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    	
    	return r;
		
	}
	
	public int change(Student student) {
		// updating database
		String query = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}
	
	public int delete(int studentId) {
		// deleting data from database
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}
	
	public Student getStudent(int studentId) {
		// SELECTING data for single student
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	public List<Student> getAllStudents() {
		// SELECTING all students data as a single list of Students
		String query = "SELECT * FROM STUDENT";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = jdbcTemplate.query(query, rowMapper);
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	



	
	

}
