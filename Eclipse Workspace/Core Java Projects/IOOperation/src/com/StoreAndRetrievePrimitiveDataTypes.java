package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StoreAndRetrievePrimitiveDataTypes {

	public static void main(String[] args) throws Exception{
	 //store data as id,name,salary
//		int id=100;
//		String name = "Ravi";
//		float salary = 12000;
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		System.out.println("Employee details stored");
		
		// read employee details from file 
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id = dis.readInt();
		String name = dis.readUTF();
		float salary = dis.readFloat();
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		
	}

}
