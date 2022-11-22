package com.main;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
//	Employee emp1 = new Employee();
//	emp1.setId(100);
//	emp1.setName("Ravi");
//	emp1.setSalary(12000);
//	
//	Employee emp2 = new Employee(101, "Raju", 14000);
//	
//	System.out.println(" id is "+emp1.getId());
//	System.out.println(" name is "+emp1.getName());
//	System.out.println("salary is "+emp1.getSalary());
//	
//	System.out.println(" id is "+emp2.getId());
//	System.out.println(" name is "+emp2.getName());
//	System.out.println("salary is "+emp2.getSalary());
//	
//	System.out.println(emp2);		// when we display the reference with display packageName.className@code
		
	Employee emp1 = new Employee(100, "Ravi", 12000);
	Employee emp2 = new Employee(100, "Ravi", 12000);
		Employee emp3 = new Employee(102, "Ramesh", 18000);
	Employee emp4 = emp1;
	System.out.println(emp1.hashCode());
	System.out.println(emp2.hashCode());
	System.out.println(emp3.hashCode());
	System.out.println(emp4.hashCode());
//	System.out.println(emp1==emp2);
//	System.out.println(emp1==emp3);
//	System.out.println(emp1==emp4);
	System.out.println(emp1.equals(emp2));		//emp1 is current object and emp2 is passing object. 
//		byte a  = 127;			// -128 to 127;
//		System.out.println(127);
//		short b = 130;
//		byte c = (byte)b;
//		System.out.println(c);
	}

}
