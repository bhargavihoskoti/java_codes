package com.training;

import javax.xml.ws.Endpoint;
public class Application {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:");
		
		System.out.println("Service Publisher");
	}

}
