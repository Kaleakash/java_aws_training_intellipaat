package com;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//	Employee emp1 = new Employee(100,"Ravi",12000);	
//	System.out.println(emp1);// it call toString method 
//	
//	FileOutputStream fos = new FileOutputStream("employee.ser");
//	ObjectOutputStream oos = new ObjectOutputStream(fos);
//	oos.writeObject(emp1);
//	System.out.println("object serialization done successfully");
		
	FileInputStream fis = new FileInputStream("employee.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj	= ois.readObject();
	Employee emp2 = (Employee)obj;
	System.out.println(emp2);
	System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());
	}

}
