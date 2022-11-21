package com;

public class RuntimeError {

	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=1;
	int abc[]= {10,20,30,40};
	String str = "1a0";
	try {
		int res = a/b; // new ArithmeticException();
		System.out.println("Result is  "+res);
		int res1 = 100/abc[1];
	System.out.println("Result is "+res1);
	System.out.println(str+10);
	System.out.println(Integer.parseInt(str)+10);
	}catch(Exception e) {
		//System.out.println("I Take Care!");		// custom msg
		//System.out.println(e.getMessage());		// pre defined msg
		//System.out.println(e.toString());			//name of the exception with msg
		e.printStackTrace();					//line, name of the exception with msg
	}
	System.out.println("Bye...");
	System.out.println("Bye...");
	System.out.println("Bye....");
	}

}
