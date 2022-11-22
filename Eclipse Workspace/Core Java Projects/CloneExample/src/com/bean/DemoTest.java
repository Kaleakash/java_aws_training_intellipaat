package com.bean;

public class DemoTest {

	public static void main(String[] args) {
	Product p1 = new Product("Tv", 50000);
	Product p2 = new Product("Computer", 42000);
	Product p3 = new Product("Laptop", 85000);
		Product p4 = p1;
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	System.out.println(p4);
	p4.setPrice(55000);
	System.out.println(p1);
	System.out.println(p4);
	System.out.println("After clone created");
		Product p5 = p2.getClone();
	System.out.println(p2);
	System.out.println(p5);
	p2.setPrice(48000);
	System.out.println("After change the price through p2");
	System.out.println(p2);
	System.out.println(p5);
	}

}
