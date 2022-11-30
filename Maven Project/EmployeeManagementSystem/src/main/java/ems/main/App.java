package ems.main;

import java.util.Iterator;
import java.util.List;

import ems.bean.Employee;
import ems.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		
//		Employee emp1 = new Employee(100, "Ramesh", 16000);
//		String result = es.storeEmployee(emp1);
//		System.out.println(result);
		
//		String result = es.findEmployee(100);
//		System.out.println(result);
		
		List<Employee> listOfEmp = es.findAllEmployee();
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			System.out.println(emp);
		}
	}
}
