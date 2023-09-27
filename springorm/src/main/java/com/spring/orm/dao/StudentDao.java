package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//Create //inserting data 
	@Transactional
	public int insert(Student student) {
		//Save the entry in database
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	//Read //fetching single object using id
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//Read all data //loadAll()
	public List<Student> getAllStudents(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//Delete //removing the data using id
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId); 	//getting the data to delete
		this.hibernateTemplate.delete(student);			//deleting the data(object)
	}
	
	
	//Update //updating the data
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
