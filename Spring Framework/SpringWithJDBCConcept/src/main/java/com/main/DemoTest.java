package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = (Employee)ac.getBean("employee");
		Employee emp2 = (Employee)ac.getBean("employee");
		emp1.setId(11);
		emp1.setName("Raju");
		emp1.setSalary(34000);
		
		emp2.setId(12);
		emp2.setName("Mahesh");
		emp2.setSalary(26000);
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
		String result1 = es.storeEmployee(emp1);
		String result2 = es.storeEmployee(emp2);
		System.out.println(result1);
		System.out.println(result2);
	}

}
