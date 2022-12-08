package com.service;

import java.util.List;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		if(ed.storeEmployee(emp)>0) {
			return "Record inserted successfully";
		}else {
			return "Record didn't insert";
		}
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Record updated";
		}else {
			return "Record not present";
		}
	}
	
	public String deleteEmployee(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Record deleted";
		}else {
			return "Record not present";
		}
	}
	
	public String findEmployee(int id) {
		Employee emp = ed.fineEmployee(id);
		if(emp ==null) {
			return "Record not present";
		}else {
			return emp.toString();
		}
	}
	public List<Employee> findAllEmployee() {
		return ed.findAllEmployee();
	}
	
	public List<Employee> findEmployeeBySalary() {
		return ed.findAllEmployeeBySalary();
	}
	
	public List<Employee> findEmployeeBySalary(float salary) {
		return ed.findAllEmployeeBySalary(salary);
	}
}
