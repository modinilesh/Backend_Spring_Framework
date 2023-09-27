package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SpringOrmProject {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		System.out.println("*************Welcome to my Spring ORM Project*************");

		// To take input
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// to run the loop
		boolean flag = true;

		while (flag) {

			try {

				// guides
				System.out.println("PRESS 1 for Adding a new Student");
				System.out.println("PRESS 2 for Display all students");
				System.out.println("PRESS 3 for Get details of single student");
				System.out.println("PRESS 4 for Delete Student");
				System.out.println("PRESS 5 for Update student");
				System.out.println("PRESS 6 for Exit");

				// Take input as integer
				int input = Integer.parseInt(br.readLine());

				// switch-case
				switch (input) {
				case 1:
					// Adding student
					//taking input from user
					System.out.println("Enter Student ID : ");
					int sId = Integer.parseInt(br.readLine());
					
					System.out.println("Enter Student Name : ");
					String sName = br.readLine();
					
					System.out.println("Enter Student City : ");
					String sCity = br.readLine();
					
					//Creating student object
					Student student = new Student(sId, sName, sCity);
					
					//Adding (Inserting) student to the database using studentDao object
					int affectedId = studentDao.insert(student);
					System.out.println("ID : "+affectedId+" is added");
					System.out.println("********************************************");

					break;

				case 2:
					// Display all
					System.out.println("********************************************");
					List<Student> allStudents = studentDao.getAllStudents();
					for(Student s : allStudents) {
						System.out.println(s);
					}
					System.out.println("********************************************");
					System.out.println();
					break;

				case 3:
					// display single
					//take input of Student Id
					System.out.println("Enter Student Id : ");
					int display_student_id = Integer.parseInt(br.readLine());
					break;

				case 4:
					// Delete student
					break;

				case 5:
					// Update student
					break;

				case 6:
					// Exit
					flag = false;
					break;
					
				default :
					System.out.println("Invalid Input..........");
					System.out.println("Please try with another valid input.");
					System.out.println();
					break;

				}

			} catch (Exception e) {
				System.out.println("Invalid data..........");
				System.out.println("Please try with valid data.");
				System.out.println(e.getMessage());
				System.out.println("********************************************");
				System.out.println();
			}

		}

	}

}
