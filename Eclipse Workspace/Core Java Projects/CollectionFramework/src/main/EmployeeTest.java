package main;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import bean.Employee;
import service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
	Employee emp1 = new Employee(1, "Raj", 12000);
	Employee emp2 = new Employee(1, "Raj", 12000);
	
	Employee emp3 = new Employee(3, "Ramesh", 15000);
	Employee emp4 = new Employee(3, "Ramesh", 15000);
	Employee emp5  = new Employee();
	emp5.setId(4);
	emp5.setName("Ahay");
	emp5.setSalary(32000);
	String res1= es.storeEmployee(emp1);
	System.out.println(res1);
	String res2= es.storeEmployee(emp2);
	System.out.println(res2);
	String res3= es.storeEmployee(emp3);
	System.out.println(res3);
	String res4= es.storeEmployee(emp4);
	System.out.println(res4);
	Set<Employee> listOfEmp = es.getAllEmployee();
	Iterator<Employee> li = listOfEmp.iterator();
	while(li.hasNext()) {
		Employee emp = li.next();
		System.out.println(emp);   //toString 
	}
//	String res5 = es.searchEmployee(4);
//	System.out.println(res5);
//	String res6 = es.searchEmployee(100);
//	System.out.println(res6);
//	System.out.println(es.numberOfRec());
//	System.out.println(emp1.hashCode());
//	System.out.println(emp2.hashCode());
//	System.out.println(emp3.hashCode());
//	System.out.println(emp4.hashCode());
	es.objectSerialization();
	}

}
