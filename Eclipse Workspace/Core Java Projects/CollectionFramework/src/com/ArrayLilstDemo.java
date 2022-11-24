package com;

import java.util.ArrayList;
class A {}
class B {}
public class ArrayLilstDemo {

	public static void main(String[] args) {
	// we can store any types values 
//		ArrayList al = new ArrayList();
//		System.out.println("size is "+al.size());
//		//Integer a = new Integer(10);
//		al.add(100);	// auto-boxing : converting int primitive to Object class ref. 
//		al.add(100.20);
//		al.add("Ravi");
//		al.add(true);
//		A obj1 = new A();
//		B obj2 = new B();
//		al.add(obj1);
//		al.add(obj2);
//		System.out.println(al);
		
		ArrayList al  = new ArrayList();
		System.out.println("size is "+al.size());
		System.out.println("Empty "+al.isEmpty());
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("using 0 index position "+al.get(0));
		System.out.println("using 1 index position "+al.get(1));
		al.add(1, 100);
		System.out.println("using 0 index position "+al.get(0));
		System.out.println("using 1 index position "+al.get(1));
		System.out.println(al);
		al.remove(3);		// remove elements using index position 
		Integer a = 20;
		al.remove(a);			// remove using value 
		System.out.println(al);
		System.out.println("Search "+al.contains(100));
		System.out.println("Empty "+al.isEmpty());
		al.clear();
		System.out.println("Empty "+al.isEmpty());
		System.out.println("size is "+al.size());
	}

}
