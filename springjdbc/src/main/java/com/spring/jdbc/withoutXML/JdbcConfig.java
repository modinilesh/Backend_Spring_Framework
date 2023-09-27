package com.spring.jdbc.withoutXML;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao")
public class JdbcConfig {
	
	//It will build up source/mysql
	@Bean("dmds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Nilesh@123");
		
		return ds;
	}
	
	
	//It will create JdbcTemplate
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate t = new JdbcTemplate(getDataSource());
		return t;
	}
	
	
	//StudentDaoImpl contains all CRUD operations
//	@Bean("studentDao")
//	public StudentDao getStudentDao() {
//		StudentDaoImpl s = new StudentDaoImpl();
//		s.setJdbcTemplate(getTemplate());
//		
//		return s;
//	}

}
