package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity		//used to define that these are the entities
@Table(name = "student_details") 		//table will be created for mapping
public class Student {
	
	

	@Id			//tells that this value is id 
	@Column(name = "student_id")	//a column in the table will be created for studentId
	private int studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_city")
	private String studentCity;

	
	//Constructors
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public Student() {
		
	}

	
	//Getters & Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	
	
	

}
