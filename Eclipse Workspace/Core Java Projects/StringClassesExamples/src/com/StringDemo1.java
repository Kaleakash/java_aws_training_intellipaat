package com;

public class StringDemo1 {

	public static void main(String[] args) {
//		String str1 = "Welcome to Java Training e";
//		String str2 = new String("Welcome to Java Training");
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str1.length());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.substring(3));	// start index from 0 
//		System.out.println(str1.substring(4, 10));	//start index from 0 and end index-1
//		System.out.println(str1.charAt(0));
//		System.out.println(str1.indexOf('e'));
//		System.out.println(str1.lastIndexOf('e'));
//		String name1 ="Raj";
//		String name2 = "raj";
//		System.out.println(name1.compareTo(name1));
//		System.out.println(name1.compareToIgnoreCase(name2));
//		System.out.println(name2.compareToIgnoreCase(name1));
//			String name1 = "Raj";
//			String name2 = "Raj";
//		String name3 = new String("Raj");
//		String name4 = new String("Raj");
//		if(name3.equalsIgnoreCase(name4)) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");
//		}
		String name = "Ajay";
			System.out.println(name);
				System.out.println(name.concat(" Kumar"));
			System.out.println(name);
		name = name.concat(" Kumar");
		System.out.println(name);
		
		StringBuffer sb = new StringBuffer("Ajay");
			System.out.println(name);
				System.out.println(sb.append(" Kumar"));
			System.out.println(name);
			sb.insert(5, "Patil ");
			System.out.println(sb);
			sb.delete(10, 12);
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
	}

}
