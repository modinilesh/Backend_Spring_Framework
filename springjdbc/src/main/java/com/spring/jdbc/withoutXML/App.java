package com.spring.jdbc.withoutXML;

import com.spring.jdbc.entities.Student;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	StudentDao studentDao = (StudentDao) context.getBean("studentDao");
    	
    	//M2 : Recommended
    	//creating a Student object which will be input for database
//    	INSERT
    	Student student = new Student();
    	student.setId(669);
    	student.setName("Sunil");
    	student.setCity("Mumbai");
    	int result = studentDao.insert(student);
    	System.out.println("No. of rows inserted----> "+ result);
//    	
    	
//    	//UPDATE
//    	Student student = new Student();
//    	student.setId(223);	//id at which we want to update data
//    	student.setName("Chanda Modi");
//    	student.setCity("Indore");
//    	int result = studentDao.change(student);
//    	System.out.println("No. of rows updated----> "+ result);
    	
    	//DELETE
//    	Student student = new Student();
//    	student.setId(667);	//id at which we want to DELETE data
//    	int result = studentDao.delete(student.getId());
//    	System.out.println("No. of rows DELETED----> "+ result);
    	
    	
    	//SELECTING single student data
//    	Student student = studentDao.getStudent(222);
//    	System.out.println(student);
       
    	
    	//SELECTING all students data
    	List<Student> students = studentDao.getAllStudents();
    	for(Student s : students) {
    		System.out.println(s);
    	}
    	
       
    }
}
