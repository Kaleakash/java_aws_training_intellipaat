package com.main;

import com.entity.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	// Insert Query 
		Employee emp1 = new Employee(14, "Ajay", 14000);
		EmployeeService es = new EmployeeService();
		String result = es.storeEmployee(emp1);
		System.out.println(result);

	}

}
