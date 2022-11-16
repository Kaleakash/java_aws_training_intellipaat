package com;

public class Manager extends Employee{

	private int numberOfEmp;
	
	Address add = new Address();
	public void readMgr() {
		readEmployee();		//id name,salary 
		System.out.println("Enter the number of employee working under manager");
		numberOfEmp = sc.nextInt();
		add.readAdd();   // read city and state 
		
	}
	public void disMgr() {
		displayEmployee();	// display id,name,salary 
		System.out.println("number of employee are"+numberOfEmp);
		add.disAdd();    // display city and state 
	}
}
