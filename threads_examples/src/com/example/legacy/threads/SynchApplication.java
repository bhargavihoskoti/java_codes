package com.example.legacy.threads;

public class SynchApplication {

	public static void main(String[] args) {
		
		new PrintStringTask("Idly","Sambhar");
		new PrintStringTask("Pizza","Coke");
		new PrintStringTask("Noddles","Mojito");
		new PrintStringTask("Puri","Bhaji");

	}

}
