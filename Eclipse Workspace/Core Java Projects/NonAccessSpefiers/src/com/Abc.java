package com;

public class Abc {
	int a;		// non static variable 
	static int b;	// static varaible 
	
	void dis1() {
		System.out.println("non static method");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	
	static void dis2() {
		System.out.println("static method");
		Abc obj = new Abc();
		System.out.println("a "+obj.a);
		System.out.println("b "+b);
	}
}
