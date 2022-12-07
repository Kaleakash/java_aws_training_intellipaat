package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//		Employee emp1 = (Employee)ac.getBean("employee");
//		Employee emp2 = (Employee)ac.getBean("employee");
//		emp1.setId(13);
//		emp1.setName("Ramesh");
//		emp1.setSalary(36000);
//		
//		emp2.setId(14);
//		emp2.setName("Lokesh");
//		emp2.setSalary(28000);
//		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//		String result1 = es.storeEmployee(emp1);
//		String result2 = es.storeEmployee(emp2);
//		System.out.println(result1);
//		System.out.println(result2);
		List<Map<String, Object>> listOfEmp = es.getAllEmployee();
		Iterator<Map<String, Object>> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Map<String, Object> mm  = li.next();
			System.out.println(mm);
		}
	}

}
