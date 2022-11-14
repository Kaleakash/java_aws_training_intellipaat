import java.util.Scanner;
class EmployeeDetails {
	public static void main(String args[]) {
	String name ="Raj";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the id");
	int id = sc.nextInt();
	System.out.println("Enter the name");
	String fname = sc.next();		// scan string value through keyboards. 
	System.out.println("Enter the salary");
	float salary = sc.nextFloat();
	float hra =salary * 0.10f;
	float da = salary*0.05f;
	float pf = salary *0.07f;
	salary = salary + hra + da - pf;
	System.out.println("Employee details are");
	System.out.println("id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
	}
}