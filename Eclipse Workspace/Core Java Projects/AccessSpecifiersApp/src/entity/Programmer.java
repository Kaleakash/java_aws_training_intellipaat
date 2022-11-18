package entity;

import bean.Employee;

public class Programmer extends Employee{

	public void disPrgInfo() {
		//System.out.println("id is "+id);	private can't access 
		//System.out.println("name is "+name);	default can't access 
		System.out.println("salary is "+salary);
		System.out.println("desg "+designation);
	}
}
