package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Profile;

import com.example.demo.utility.Student;

@Configuration
public class AppConfig {
	
	@Bean
	@Profile(value="dev")
	public Student ram() {
		return new Student(1,"Ramesh",78);
	}
	@Bean
	@Profile(value="dev")
	public Student uma() {
		return new Student(2,"Uma",89);
	}
	@Bean
	@Profile(value="prod")
	public Student vik() {
		return new Student(3,"Vikas",80);
	}
	@Bean
	@Profile(value="prod")
	public Student mon() {
		return new Student(4,"Monika",67);
	}
	@Bean
	@Profile(value="prod")

	public Student jan() {
		return new Student(5,"Janvi",92);
	}
	@Bean
	
	public Student Bha() {
		return new Student(6,"Bhagya",95);
	}

}
