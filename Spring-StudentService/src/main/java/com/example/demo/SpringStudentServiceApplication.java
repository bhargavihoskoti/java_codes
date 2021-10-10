package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.utility.StudentList;

@SpringBootApplication
public class SpringStudentServiceApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SpringStudentServiceApplication.class, args);
	
	StudentList service= ctx.getBean(StudentList.class);
	
	service.getStudentList().forEach(System.out::println);
	
//	System.out.println("is Singleton:="+ctx.isSingleton("studentList"));
//	System.out.println("is Prototype:="+ctx.isSingleton("studentList"));
	
	ctx.close();
}

}
