package ems.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
	
	static Connection con;
	// this code execute only one time. 
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root@123");
		} catch (Exception e) {
			System.out.println("in static block "+e.toString());
		}
	}
	
	public static Connection getDbConnection() {
		try {
		return con;
		} catch (Exception e) {
		System.out.println("in Resource layer "+e.toString());
		return null;
		}
	}
}
