package com;
//class Emp {
//	public Emp() {
//		this(100);		// we are calling parameter constructor 
//	System.out.println("Emp()");
//	}
//	public Emp(int id) {
//		this(101,"Ravi");
//		System.out.println("Emp(int)");
//	}
//	public Emp(int id, String name) {
//		System.out.println("Emp(int,string)");
//	}
//}
class Employee {
	private int id;
	private String name;
	private float salary;
	public Employee() {
		this.id = 123;
		this.name = "Unknown";
		this.salary = 25000;
	}
	public Employee(int id) {
		this();
		this.id=id;
	}
	public Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	public void display() {
		System.out.println("id is "+id+" name is "+name+" salary "+salary);
	}
}
public class ThisParameter {
	public static void main(String[] args) {
		//Emp e1 = new Emp();
		//Emp e2 = new Emp(100);
		//Emp e3 = new Emp(101, "Ravi");
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(1);
		Employee emp3 = new Employee(2,"Ravi");
		emp1.display();
		emp2.display();
		emp3.display();
	}
}








