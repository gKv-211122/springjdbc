package com.spring.jdbc;

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
        System.out.println( "program started...");
        
        // spring jdbc -> JdbcTemplate
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        // configuration using java
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        //JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
    
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        // INSERT
//        Student student = new Student();
//        student.setId(111);
//        student.setName("suman");
//        student.setCity("Kolakata");
//        
//        int result = studentDao.insert(student);
//        
//        System.out.println(result);
         
          // UPDATE
//          Student student = new Student();
//          student.setId(222);
//          student.setName("suraj");
//          student.setCity("kanpur");
//          
//          int result = studentDao.change(student);
//          System.out.println(result);
        	
        	// DELETE
//        	int result = studentDao.delete(111);
//        	System.err.println("deleted: " + result );
//        	
        	// SELECT Single Object
//        	Student student = studentDao.getStudent(222);
//        	System.out.println(student);
        	
        	// SELECT Multiple Object
        	List<Student> student = studentDao.getAllStudents();
        	for(Student s: student) {
        		
        		System.out.println(s);
        	}
          
        
    }
}
