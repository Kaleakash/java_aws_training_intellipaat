package com.service;

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
	
}
