package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;			// di for DAO layer 
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<30000) {
			return "Salary must be > 30000";
		}else if(employeeDao.storeEmployee(emp)>0) {
			return "Record stored successfully";
		}else {
			return "REcord didn't store";
		}
	}
	
	public List<Map<String, Object>> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
}
