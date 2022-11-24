package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//Set ss = new HashSet();
		//Set ss = new LinkedHashSet();
		Set ss =new TreeSet();
		System.out.println("Size "+ss.size());
		System.out.println("is empty "+ss.isEmpty());
		ss.add(10);
		ss.add(20);
		ss.add(50);
		//ss.add("Ravi");
		ss.add(80);
		ss.add(null);
		ss.add(90);
		ss.add(60);
		ss.add(10);
		System.out.println(ss);
		System.out.println("Search "+ss.contains(10));
		System.out.println("Seach "+ss.contains(100));
		ss.remove(10);
		System.out.println(ss);
		System.out.println("Size "+ss.size());
		System.out.println("is empty "+ss.isEmpty());
	}

}
