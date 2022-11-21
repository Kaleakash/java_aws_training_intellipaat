package com;

public class TryCatchAndFinally {

	public static void main(String[] args) {
//	System.out.println("Hi");
//	try {
//		int res = 10/1;
//		System.out.println("No Exception");
//	}catch (Exception e) {
//		System.out.println("Catch block");
//	}finally {
//		System.out.println("finally block");
//	}
//	System.out.println("Normal statement");
	
	System.out.println("Hi");
	try {
		int res = 10/0;
		System.out.println("No Exception ");
	} finally {
		System.out.println("finally block");
	}
	System.out.println("normal statement");
	}

}
