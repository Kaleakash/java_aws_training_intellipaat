package com;
import java.sql.*;
import java.util.Scanner;
public class DemoTest {

	public static void main(String[] args){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root@123");
	System.out.println("Database connected successfully");
	Scanner sc = new Scanner(System.in);
	Statement stmt = con.createStatement();
//	// insert query using statement reference. 
//		int res= stmt.executeUpdate("insert into employee values(7,'Veeta',32000)");
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
//	// Insert query using PreparedStatement
//	
//	PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//	System.out.println("Enter the id");
//	int id = sc.nextInt();
//	pstmt.setInt(1, id);		// set the first ? mark id value 
//	System.out.println("Enter the name");
//	String name = sc.next();
//	pstmt.setString(2, name);
//	System.out.println("Enter the salary");
//	float salary = sc.nextFloat();
//	pstmt.setFloat(3, salary);
//	int res = pstmt.executeUpdate();
//	if(res>0) {
//		System.out.println("Record inseted successfully");
//	}
	
		// delete query 
	
//	// delete query using statement reference. 
//			int res= stmt.executeUpdate("delete from employee where id =1");
//			if(res>0) {
//				System.out.println("Record deleted successfully");
//			}else {
//				System.out.println("Record not present");
//			}
	
//	// delete query using PreparedStatement
//	
//		PreparedStatement pstmt = con.prepareStatement("delete from employee where id =?");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		pstmt.setInt(1, id);		// set the first ? mark id value 
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
	
	
	// update query using statement reference. 
//				int res= stmt.executeUpdate("update employee set salary = 24000 where id =2");
//				if(res>0) {
//					System.out.println("Record updated successfully");
//				}else {
//					System.out.println("Record not present");
//				}
	
	
	// update query using PreparedStatement
	
//			PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id =?");
//			System.out.println("Enter the id");
//			int id = sc.nextInt();
//			pstmt.setInt(2, id);		// set the first ? mark id value
//			System.out.println("Enter the salar");
//			float salary = sc.nextFloat();
//			pstmt.setFloat(1, salary);
//			int res = pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("record updated successfully");
//			}else {
//				System.out.println("Record not present");
//			}
			
//		ResultSet rs = stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//			System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//		}
//		
//		rs.close();
//		stmt.close();
		
		// retrive using prepared statement 
	
			//PreparedStatement pstmt = con.prepareStatement("select * from employee");
	PreparedStatement pstmt = con.prepareStatement("select * from employee where salary > ?");
	System.out.println("Plz enter the salary");
	float salary = sc.nextFloat();
	pstmt.setFloat(1, salary);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
			}
	
		} catch (Exception e) {
		System.out.println(e);
		}

	}

}
