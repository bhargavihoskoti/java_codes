package com.example.demo;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactiveSpringApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext ctx= SpringApplication.run(ReactiveSpringApplication.class, args);
	
		Flux<String> namePublisher =Flux.just("Gouri","Pooja","Janvi","ishrat");
		
		//namePublisher.subscribe(System.out::println);
		namePublisher.subscribe(new Subscriber<String>() {

			

			@Override
			public void onSubscribe(Subscription s) {
				s.request(4);
				
				
			}
			public void onNext(String t) {
				System.out.println(t.toString());
				
			}

		

			@Override
			public void onError(Throwable t) {
				System.out.println(t.getMessage());
				
			}

			@Override
			public void onComplete() {
				System.out.println("Completed");
				
			}




			
		}); 
	}

}
