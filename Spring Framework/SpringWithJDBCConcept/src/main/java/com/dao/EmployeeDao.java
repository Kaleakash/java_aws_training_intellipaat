package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

//	@Autowired					// we are pulling db connection from beans.xml file 
//	DataSource ds;		// before sprign framework we are lookup datasource from 
//							// application server using JNDI look up. 
//							// from spring framework onward we can achieve this one using @autowired
//	public int storeEmployee(Employee emp) {
//		try {
//		Connection con = ds.getConnection();	
//		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//		pstmt.setInt(1, emp.getId());
//		pstmt.setString(2, emp.getName());
//		pstmt.setFloat(3, emp.getSalary());
//		return pstmt.executeUpdate();
//		} catch (Exception e) {
//			System.out.println(e.toString());
//			return 0;
//		}
//	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;		// search in xml file for jdbcTemplate 
	
	public int storeEmployee(Employee emp) {
		try {
		//return jdbcTemplate.update("insert into emp values(1,'Ravi',120000)");
		return jdbcTemplate.update("insert into employee values(?,?,?)", emp.getId(),emp.getName(),emp.getSalary());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public List<Map<String, Object>> getAllEmployee() {
		try {
			 return jdbcTemplate.queryForList("select * from employee");
			// jdbcTemplate.query("select * from Employee", new MyResultSet());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
	
//	public List<Employee> getAllEmployeeInfo() {
//		try {
//		
//			 return jdbcTemplate.query("select * from Employee", new MyResultSet());
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//			return null;
//		}
//	}
}

class MyResultSet implements ResultSetExtractor<Employee>{
	@Override
	public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		return emp;
	}
}