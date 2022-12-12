package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	// http://localhost:8080/singleQuery?name=Ravi
	@RequestMapping(value = "singleQuery",method = RequestMethod.GET)
	public String singleQueryParam(@RequestParam("name") String uname) {
		// we pass this value to service to dao layer. 
		return "Welcome to spring boot with single query param "+uname;
	}
	
	// http://localhost:8080/multiQuery?name=Ravi&pass=123
	// http://localhost:8080/multiQuery?name=Ravi&pass=123456
	
		@RequestMapping(value = "multiQuery",method = RequestMethod.GET)
		public String multiQueryParam(@RequestParam("name") String uname, @RequestParam("pass") String pass) {
				if(uname.equals("Ravi") && pass.equals("123")) {
					return "success using query param";
				}else {
					return "failure using query param";
				}
		}
		
	// http://localhost:8080/singlePath/Ravi
		@RequestMapping(value = "singlePath/{name}",method = RequestMethod.GET)
		public String singlePathParam(@PathVariable("name") String uname) {
			// we pass this value to service to dao layer. 
			return "Welcome to spring boot with single path param "+uname;
	}
	
		// http://localhost:8080/multiPath/Ravi/123
		// http://localhost:8080/multiPath/Ravi/123456
				@RequestMapping(value = "multiPath/{name}/{pass}",method = RequestMethod.GET)
				public String multiPathParam(@PathVariable("name") String uname, @PathVariable("pass") String pass) {
					if(uname.equals("Ravi") && pass.equals("123")) {
						return "success using path param";
					}else {
						return "failure using path param";
					}	
			}
		
}

