package com.example.demo;

//Since RangeCheckException is extending Exception its a Checked Exception
//So it has to follow handle or declare rule
//In the following we are declaring using throws clause
public class RangeCheckException extends Exception {

	private String message;

	public RangeCheckException(String message) {
		super(message);
		this.message=message;
	}

	@Override
	public String getMessage() {
		return "Exception:="+message;
	}	
}
