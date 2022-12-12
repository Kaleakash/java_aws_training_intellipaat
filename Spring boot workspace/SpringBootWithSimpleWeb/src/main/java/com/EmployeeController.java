package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	// http://localhost:8080/employeeDetailsJson 
	
	@RequestMapping(value = "employeeDetailsJson",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeDetailsJson() {
		Employee emp = new Employee(100, "Ravi", 12000);
		return emp;
	}
	// http://localhost:8080/employeeDetailsXml
	@RequestMapping(value = "employeeDetailsXml",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_XML_VALUE)
	public Employee getEmployeeDetailsXml() {
		Employee emp = new Employee(100, "Ravi", 12000);
		return emp;
	}
	// http://localhost:8080/employeeAllEmployeesJson
	@RequestMapping(value = "employeeAllEmployeesJson",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeJson() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ravi", 12000));
		listOfEmp.add(new Employee(2, "Rajesh", 14000));
		listOfEmp.add(new Employee(3, "Ram", 16000));
		return listOfEmp;
	}
//	// http://localhost:8080/employeeAllEmployeesXml
//	@RequestMapping(value = "employeeAllEmployeesXml",method = RequestMethod.GET,
//			produces = MediaType.APPLICATION_XML_VALUE)
//	public List<Employee> getAllEmployeeXml() {
//		List<Employee> listOfEmp = new ArrayList<Employee>();
//		listOfEmp.add(new Employee(1, "Ravi", 12000));
//		listOfEmp.add(new Employee(2, "Rajesh", 14000));
//		listOfEmp.add(new Employee(3, "Ram", 16000));
//		return listOfEmp;
//	}
}
