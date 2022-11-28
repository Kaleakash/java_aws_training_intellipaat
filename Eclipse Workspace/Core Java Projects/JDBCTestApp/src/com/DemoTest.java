package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root@123");
	System.out.println("Database connected successfully");
	Statement stmt = con.createStatement();
//	// insert query using statement reference. 
//		int res= stmt.executeUpdate("insert into employee values(7,'Veeta',32000)");
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
		// delete query 
	
//	// delete query using statement reference. 
//			int res= stmt.executeUpdate("delete from employee where id =1");
//			if(res>0) {
//				System.out.println("Record deleted successfully");
//			}else {
//				System.out.println("Record not present");
//			}
	
	// update query using statement reference. 
				int res= stmt.executeUpdate("update employee set salary = 24000 where id =2");
				if(res>0) {
					System.out.println("Record updated successfully");
				}else {
					System.out.println("Record not present");
				}
		} catch (Exception e) {
		System.out.println(e);
		}

	}

}
