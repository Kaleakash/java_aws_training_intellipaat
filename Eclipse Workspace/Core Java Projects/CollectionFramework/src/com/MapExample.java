package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		//Map mm1 = new HashMap();
		//Map mm1 = new LinkedHashMap();
		//Map mm1 = new TreeMap();
		Map mm1 = new Hashtable();
		mm1.put(2, "Ravi");
		mm1.put(3, "Ramesh");
		mm1.put(1, "Lokesh");
		mm1.put(4, "Rajesh");
		mm1.put("abc", "Reeta");
		System.out.println(mm1);
			mm1.put(1, "Ajay");		// it will replace by new value. 
		mm1.put(5, "Ramesh");
		System.out.println(mm1);
		System.out.println(mm1.containsKey(1));
		System.out.println(mm1.containsKey(100));
		System.out.println(mm1.containsValue("Ravi"));
		System.out.println(mm1.containsValue("Mahesh"));
		System.out.println(mm1.get(1));
		//mm1.put(null, "Vikash");
		//mm1.put(6, null);
		//mm1.put(null, null);
		System.out.println(mm1);
	}

}
