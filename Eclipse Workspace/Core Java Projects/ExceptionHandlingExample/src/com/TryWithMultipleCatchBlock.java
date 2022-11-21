package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		String str = "10";
		try {
			int res = a/b; // new ArithmeticException();
			System.out.println("Result is  "+res);
			int res1 = 100/abc[2];
		System.out.println("Result is "+res1);
		System.out.println(str+10);
		System.out.println(Integer.parseInt(str)+10);
		}catch(ArithmeticException e) {
			System.out.println("Divided by zero "+e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index "+e.toString());
		}catch(NumberFormatException e) {
			System.out.println("Number format "+e.toString());
		}catch(Exception e) {
			System.out.println("Generic "+e.toString());
		}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye....");

	}

}
