package com;

public class WrapperClasses {

	public static void main(String[] args) {
		int a=10; // primitive value 
		//Integer b= new Integer(a);	// converting primitive to object 
		Integer b = a;				// auto-boxing : converting primitive to object. 
		int c = b.intValue();
		float d = b.floatValue();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		Integer m = 100;
		int n =100;
		int x = m;				// auto-unboxing : converting object to primitive 
		
		String s1 ="10";
		String s2 = "20";
			System.out.println(s1+s2);
		int s3 = Integer.parseInt(s1);
		int s4 = Integer.parseInt(s2);
			System.out.println(s3+s4);
		String s5 = String.valueOf(s3);
		String s6  = String.valueOf(s4);
			System.out.println(s5+s6);
		//Character cc = new Character('a');
			Character cc = 'a';
			
		System.out.println(cc);
	
	}

}
