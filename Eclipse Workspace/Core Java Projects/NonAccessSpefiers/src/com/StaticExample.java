package com;

public class StaticExample {

	public static void main(String[] args) {
		Abc obj = new Abc();
		obj.a=100;
		
			Abc.b=200;
			obj.b=300;
		
		obj.dis1();
			
			Abc.dis2();
			obj.dis1();

	}

}
