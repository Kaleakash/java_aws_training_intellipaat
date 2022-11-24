package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// Collection framework without generics 
//		List ll = new ArrayList();
//		ll.add(100);
//		ll.add("Ravi");
//		ll.add(true);
//		ll.add(10.20);
//		
//		Object obj = ll.get(1);
//		if(obj instanceof String) {
//			String s = (String)obj;
//			System.out.println(s);
//		}
//		if(obj instanceof Integer) {
//			Integer i = (Integer)obj;
//			int n = i.intValue();
//			System.out.println(n);
//		}
		// collection framework with generics 
		//CollectionClass<Type> obj = new Collection<Type>();
		// type can be Integer, Float, Character, Double, String , Employee, Customer etc 
		List<Integer> ll1 = new ArrayList<Integer>();
		List<String> ll2 = new ArrayList<String>();
		List<Object> ll3 = new ArrayList<Object>();
		ll3.add(100);
		ll3.add("Ravi");
		ll3.add(10.20);
		
		ll1.add(100);				// auto-boxing : converting int to Integer 
		ll1.add(200);
		
		ll2.add("Ravi");
		ll2.add("Lokesh");
			
		int n = ll1.get(0);			// auto unboxing : converting Integer to int 
		System.out.println(n);
		
		String name = ll2.get(0);
		System.out.println(name);
	}

}
