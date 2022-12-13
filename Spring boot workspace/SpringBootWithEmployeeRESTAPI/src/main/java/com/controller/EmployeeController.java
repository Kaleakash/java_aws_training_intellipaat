package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:8080/findAllEmployee
	
	@RequestMapping(value="findAllEmployee",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployee() {
		return employeeService.findAllEmployee();
	}
	// search using query param with return string 
	
// http://localhost:8080/findEmployeeById1?id=2
	// http://localhost:8080/findEmployeeById1?id=100
	@RequestMapping(value = "findEmployeeById1",method = RequestMethod.GET)
	public String findEmployeeById1(@RequestParam("id") int id) {
		return employeeService.findEmployeeInObjectString(id);		
	}
	// http://localhost:8080/findEmployeeById2?id=1
		// http://localhost:8080/findEmployeeById2?id=100
	@RequestMapping(value = "findEmployeeById2",method = RequestMethod.GET)
	public Employee findEmployeeById2(@RequestParam("id") int id) {
		return employeeService.findEmployeeInObjectFormat(id);		
	}
	
	// search using path param with return string as well object 
	// http://localhost:8080/findEmployeeById3/1
		// http://localhost:8080/findEmployeeById3/100
	@RequestMapping(value = "findEmployeeById3/{id}",method = RequestMethod.GET)
	public String findEmployeeById3(@PathVariable("id") int id) {
		return employeeService.findEmployeeInObjectString(id);		
	}
	
	// http://localhost:8080/findEmployeeById4/1
	// http://localhost:8080/findEmployeeById4/100
	
	@RequestMapping(value = "findEmployeeById4/{id}",method = RequestMethod.GET)
	public Employee findEmployeeById4(@PathVariable("id") int id) {
		return employeeService.findEmployeeInObjectFormat(id);		
	}
	
	// http://localhost:8080/storeEmployeeInfo 		: they have to send the data in json format. 
	
	@RequestMapping(value = "storeEmployeeInfo",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployeeDetails(@RequestBody Employee emp) {   //@RequestBody : this annotation is use to extract the from the body part. 
		System.out.println(emp);     // it will all toString method
		return "Employee data stored";
	}
	
}
