package entity;

import bean.Employee;

public class Department {

	Employee emp = new Employee();
	
	public void disEmpInfo() {
		//System.out.println("id is "+emp.id);			private 
		//System.out.println("name is "+emp.name);		default 
		//System.out.println("salary is "+emp.salary);	protected 
		System.out.println("desg "+emp.designation);	
	}
}
