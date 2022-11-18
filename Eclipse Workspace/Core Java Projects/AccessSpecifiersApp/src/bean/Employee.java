package bean;

public class Employee {
private int id;
String name;
protected float salary;
public String designation;

public void disEmpInfo() {
	System.out.println("id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
	System.out.println("desg "+designation);
}

}
