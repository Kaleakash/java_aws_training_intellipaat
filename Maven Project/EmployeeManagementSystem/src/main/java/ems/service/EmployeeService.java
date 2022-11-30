package ems.service;

import java.util.Iterator;
import java.util.List;

import ems.bean.Employee;
import ems.dao.EmployeeDao;

public class EmployeeService {

	public String storeEmployee(Employee emp) {
		EmployeeDao ed = new EmployeeDao();
		
		if(emp.getSalary()<12000) {
			return "Salary must be > 12000";
		}else if(ed.storeEmployee(emp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String findEmployee(int id) {
		EmployeeDao ed = new EmployeeDao();
		Employee emp = ed.findEmployee(id);
		if(ed.findEmployee(id)==null) {
			return "Record not present with id as "+id;
		}else {
			return emp.toString();
		}
	}
	
	public List<Employee> findAllEmployee() {
		EmployeeDao ed = new EmployeeDao();
		List<Employee> listOfEmp = ed.findAllEmployee();
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			emp.setSalary(emp.getSalary()+500);
		}
		
		return listOfEmp;
	}
}
