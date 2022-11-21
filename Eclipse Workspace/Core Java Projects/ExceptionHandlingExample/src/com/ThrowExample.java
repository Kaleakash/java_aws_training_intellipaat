package com;

public class ThrowExample {

	public static void main(String[] args) {
		int age=18;
		
		try {

		if(age<21) {
			//throw new Exception(); // generic exception generated
			//throw new Exception("age must be > 21");
			//throw new ArithmeticException();	// specific execption
			//throw new ArithmeticException("age must be > 21"); 
			//throw new VoteException(); // custom exception 
			throw new VoteException(" age must be > 21");	// custom exception with custom message. 
		}else {
			System.out.println("You can Vote!");
		}
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
