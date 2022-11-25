package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import bean.Employee;

public class EmployeeService {

	//private List<Employee> listOfEmp = new ArrayList<Employee>();
	private HashSet<Employee> listOfEmp = new HashSet<Employee>();
	static {
		try {
			FileInputStream fis = new FileInputStream("employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Set<Employee> ss = (Set<Employee>)obj;
			System.out.println(ss.size());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String storeEmployee(Employee emp) {
		
		listOfEmp.add(emp);
		
		return "Employee Record stored";
	}
	
	public Set<Employee> getAllEmployee() {
		
		return listOfEmp;
	}
	
	public String searchEmployee(int id) {
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee e = li.next();
			if(e.getId()==id) {
				return e.toString();
			}
		}
		return "Record not present";
	}
	
	public int numberOfRec() {
		return listOfEmp.size();
	}
	
	
	public void objectSerialization() {
		try {
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(listOfEmp);
		System.out.println("object stored successfully");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
