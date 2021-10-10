package com.example.demo;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Ramesh","Suresh","Magesh");
		
		List<String> city=Arrays.asList("Koppal","Belagavi","Bellary");
		
		for(String eachName:names) {
			//System.out.println(eachName);
		}
		names.forEach(e->System.out.println(e));
		
		//Consumer<String> print=(e)-> System.out.println(e); //invokeing the method (e)
		
		//1
		Consumer<String> print= System.out::println;
		//:: giving a method used for calling
		
		//names.forEach(print);
		city.forEach(print);
		
		Student ram=new Student(101,"Ramesh",LocalDate.now(),90);
		//2 
		Predicate<Student> result= (obj) -> obj.getMarkScored()>80;
		
		System.out.println("Result:="+result.test(ram));
		
		//3
		Supplier<String> message=() -> "Happy Dusherra";
		
		System.out.println("Greeting:="+message.get());
		
		//4
		Function<String,Integer> func=(arg) -> arg.length();
		
		System.out.println(func.apply(message.get()));
		
		
		
	}

}
