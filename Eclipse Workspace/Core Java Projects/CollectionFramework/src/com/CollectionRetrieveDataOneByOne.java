package com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
public class CollectionRetrieveDataOneByOne {

	public static void main(String[] args) {
//	Set ss = new HashSet();
//	ss.add("Ravi");ss.add("Ramesh");ss.add("Ajay");ss.add("Vijay");ss.add(100);
//	System.out.println(ss);
//	System.out.println("Using for each loop");
//	for(Object name : ss) {
//			System.out.println(name);		
//	}
//	System.out.println("Using iterator");
//	Iterator ii = ss.iterator();
//	while(ii.hasNext()) {
//		Object obj = ii.next();			
//		System.out.println(obj);
//	}
//	List ll = new ArrayList();
//	ll.add("Ravi");ll.add("Ramesh");ll.add("Ajay");ll.add("Vijay");ll.add(100);
//	//we can use for each loop 
//	// we can use iterator 
//	// we can use ListIterator 
//	System.out.println("Forward direction");
//	ListIterator li = ll.listIterator();
//	while(li.hasNext()) {
//		System.out.println(li.next());
//	}
//	System.out.println("Backward direction");
//	while(li.hasPrevious()) {
//		System.out.println(li.previous());
//	}
	
//	Map mm = new HashMap();
//	mm.put(2, "Ravi");
//	mm.put(1, "Ramesh");
//	mm.put(4, "Lokesh");
//	mm.put(3, "Rajesh");
//	// for each we can't use 
//	 // we can't use iterator as well as listiterator directly on map 
//	Set ss = mm.entrySet(); // it will convert map to set (key-value);
//	Iterator ii =ss.iterator();
//	while(ii.hasNext()) {
//		Map.Entry me = (Map.Entry)ii.next();	//Map is outer and Entry in inner interface
//		System.out.println(me.getKey()+", "+me.getValue()+" "+mm.get(me.getKey()));
//		//System.out.println(ii.next());
//	}
//	Set ss1 = mm.keySet();			// it will convert mpa to set (only keys)
//	Iterator ii1 = ss1.iterator();
//	while(ii1.hasNext()) {
//		Object key = ii1.next();
//		System.out.println("Key "+key+" Value "+mm.get(key));
//	}
		Vector vv  = new Vector();
		vv.add(100); vv.add(200); vv.add(300);
		Enumeration ee = vv.elements();
		while(ee.hasMoreElements()) {
			Object obj = ee.nextElement();
			System.out.println(obj);
		}
	}
	

}
