package com.main;

import java.util.Iterator;
import java.util.List;

import com.entity.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		// Insert Query 
//		Employee emp1 = new Employee(14, "Ajay", 14000);
//		String result = es.storeEmployee(emp1);
//		System.out.println(result);
		
		//delete query
//		String result = es.deleteEmployee(1);
//		System.out.println(result);
		
		//Update Query 
//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setSalary(20000);
//		String result = es.updateEmployee(emp);
//		System.out.println(result);
		
		// find employee using id 
//		String result = es.findEmployee(2);
//		System.out.println(result);

		//find all Employee 
//		List<Employee> listOfEmp = es.findAllEmployee();
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee e = li.next();
//			System.out.println(e);
//		}
		
//		// with condition with static value 
//		
//		List<Employee> listOfEmp = es.findEmployeeBySalary();
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee e = li.next();
//			System.out.println(e);
//		}
		// with condition with dynamic value 
		
				List<Employee> listOfEmp = es.findEmployeeBySalary(25000);
				Iterator<Employee> li = listOfEmp.iterator();
				while(li.hasNext()) {
					Employee e = li.next();
					System.out.println(e);
				}
	}

}
