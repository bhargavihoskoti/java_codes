package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.utility.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public Student ram() {
		return new Student(1,"Ramesh",78);
	}
	@Bean
	public Student uma() {
		return new Student(2,"Uma",89);
	}
	@Bean
	public Student vik() {
		return new Student(3,"Vikas",80);
	}
	@Bean
	public Student mon() {
		return new Student(4,"Monika",67);
	}
	@Bean
	public Student jan() {
		return new Student(5,"Janvi",92);
	}

}
