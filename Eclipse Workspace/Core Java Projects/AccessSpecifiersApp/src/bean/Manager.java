package bean;

public class Manager extends Employee{

	public void disMgrInfo() {
		//System.out.println("id is "+id); we can't access because it is private 
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("desg "+designation);
	}
}
