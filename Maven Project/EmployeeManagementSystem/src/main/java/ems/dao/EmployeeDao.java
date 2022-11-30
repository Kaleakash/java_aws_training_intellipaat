package ems.dao;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ems.bean.Employee;
import ems.resource.DbResource;

public class EmployeeDao {

	public int storeEmployee(Employee emp) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root@123");
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt  = con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getName());
		pstmt.setFloat(3, emp.getSalary());
		int res = pstmt.executeUpdate();
		return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public Employee findEmployee(int id) {
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root@123");
			Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt  = con.prepareStatement("select * from employee where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs= pstmt.executeQuery();
		if(rs.next()) {
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getFloat(3));
			return emp;
		}else {
			return null;
		}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<Employee> findAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root@123");
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt  = con.prepareStatement("select * from employee");
		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getFloat(3));
			listOfEmp.add(emp);
		}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfEmp;
	}
}
