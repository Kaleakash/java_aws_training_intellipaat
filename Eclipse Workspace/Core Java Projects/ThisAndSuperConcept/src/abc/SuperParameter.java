package abc;
class Employee {
	private int id;
	private String name;
	private float salary;
	public Employee() {
		System.out.println("Employee()");
	}
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void disEmp() {
		
	}
}
class Manager extends Employee {
	private int numberOfEmp;
	public Manager() {
		super();
		System.out.println("Manager()");
	}
	Manager(int id, String name, float salary,int numberOfEmp){
		super(id,name,salary);
		this.numberOfEmp=numberOfEmp;
	}
	public void disMgr() {
		
	}
}
public class SuperParameter {
	public static void main(String[] args) {
		Manager mgr = new Manager();
		Manager mgr1 = new Manager(1, "Ravi", 12000, 5);
	}
}
