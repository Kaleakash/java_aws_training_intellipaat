package com;

public class ThrowsExample {
//	static{
//		throw new Exception();
//	}
//	
	static void dis1() throws Exception{
		//try {
		int a=10/0;
		//}catch(Exception e) {}
		System.out.println("dis1()");
	}
	static void dis2() throws Exception {
		//try {
		dis1();
		//}catch(Exception e) {}
		System.out.println("dis2()");
	}
	public static void main(String[] args) throws Exception {
		//try {
		dis2();
		//}catch(Exception e) {}
		System.out.println("main method");
	}
}
