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
	Employee emp = (Employee)ac.getBean("emp1");
	emp.display();
	}

}
