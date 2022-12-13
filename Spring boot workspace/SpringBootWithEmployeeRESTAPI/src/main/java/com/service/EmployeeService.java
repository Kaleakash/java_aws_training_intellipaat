package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployee() {

		return employeeRepository.findAll();   // it is like select * from employee 	SQL
												// it is like a select e from Employee e	JPQL 
	}
	
	
	public Employee findEmployeeInObjectFormat(int id) {
	Optional<Employee> op = employeeRepository.findById(id);
	if(op.isPresent()) {
	Employee emp = op.get();
	return emp; 
	}else {
		return null;
	}
	}
	
	public String findEmployeeInObjectString(int id) {
		Optional<Employee> op = employeeRepository.findById(id);
		if(op.isPresent()) {
		Employee emp = op.get();
		
		return emp.toString();		// convert object into string format. 
		}else {
		return "Record not present with id as "+id;
		}
		
	}
}
