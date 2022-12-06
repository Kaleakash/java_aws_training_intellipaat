package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
//	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//	Address add = (Address)ac.getBean("address");
//	System.out.println(add);
//	Employee emp = (Employee)ac.getBean("employee");
//	System.out.println(emp);
//	emp.setId(101);
//	emp.setName("Ravi");
//	emp.setSalary(12000);
//	System.out.println(emp);
		
	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
	Address add = (Address)ac.getBean("address");
	System.out.println(add);
	Employee emp = (Employee)ac.getBean("employee");
	System.out.println(emp);
	emp.setId(101);
	emp.setName("Ravi");
	emp.setSalary(12000);
	System.out.println(emp);
	}

}
