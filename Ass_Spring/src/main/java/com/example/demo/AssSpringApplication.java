package com.example.demo;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.utility.Student;
import com.example.demo.utility.StudentList;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AssSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(AssSpringApplication.class, args);
		
		//StudentList list= ctx.getBean(StudentList.class);
		
		//List<Student> obj =list.getList();
		
         //obj.forEach(System.out::println);
         
         StudentList stud=ctx.getBean("ram", StudentList.class);
         log.info(stud.toString());
		ctx.close();

		
	}

}
