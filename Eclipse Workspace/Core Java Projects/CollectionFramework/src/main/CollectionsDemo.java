package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
//	List<String> names = new ArrayList<String>();
//	names.add("Ravi");
//	names.add("Ajay");
//	names.add("Vijay");
//	names.add("Lokesh");
//	names.add("Mahesh");
	String namesInfo[] = {"Ravi","Ajay","Vijay","Lokesh","Mahesh"};
	//List<String> names = Arrays.asList("Ravi","Ajay","Vijay","Lokesh","Mahesh");
	List<String> names = Arrays.asList(namesInfo);
	System.out.println(names.size());
	System.out.println("Before sort");
	for(String name:names) {
		System.out.print(name+" ");
	}
	System.out.println();
		Collections.sort(names);
	System.out.println("After sort Asc");
	for(String name:names) {
		System.out.print(name+" ");
	}
	System.out.println();
	Collections.reverse(names);
	System.out.println("After sort Desc");
	for(String name:names) {
		System.out.print(name+" ");
	}
	
	}

}
