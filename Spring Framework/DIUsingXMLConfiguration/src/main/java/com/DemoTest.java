package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.display();
//	Resource rs = new ClassPathResource("beans.xml");
//	BeanFactory bb = new XmlBeanFactory(rs);
//	Employee emp = (Employee)bb.getBean("emp1");
//	emp.display();
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//	Employee e1 = (Employee)ac.getBean("emp1");
//	e1.display();
//	
//	Employee e2 = (Employee)ac.getBean("emp1");
//	e2.display();
//	
//	Employee e3 = (Employee)ac.getBean("emp2");
//	e3.display();
//	
//	Employee e4 = (Employee)ac.getBean("emp2");
//	e4.display();
	
	Employee emp1 = (Employee)ac.getBean("emp1");
	System.err.println(emp1);
	Employee emp2 = (Employee)ac.getBean("emp2");
	System.err.println(emp2);
	Employee emp3 = (Employee)ac.getBean("emp3");
	System.err.println(emp3);
	Employee emp4 = (Employee)ac.getBean("emp4");
	System.err.println(emp4);
	}

}
