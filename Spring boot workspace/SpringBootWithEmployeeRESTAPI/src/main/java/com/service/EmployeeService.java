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
	
	public String storeEmployeeInfo(Employee emp) {
		Optional<Employee> result	= employeeRepository.findById(emp.getId());
		if(result.isPresent()) {
			return "Employee id must be unique";
		}else {
			employeeRepository.save(emp);			// insert the record or persist
			return "Employee record stored in database successfully";
		}
	}
	

	public String deleteEmployeeInfo(int id) {
		Optional<Employee> result	= employeeRepository.findById(id);
		if(result.isPresent()) {
			Employee emp = result.get();
			employeeRepository.delete(emp);					// delete query 
			return "Employee record deleted sucessfully";
		}else {
			return "Employee record not present";
		}
	}
	
	public String updateEmployeeSalary(Employee emp) {
		Optional<Employee> result	= employeeRepository.findById(emp.getId());
		if(result.isPresent()) {
			Employee e =result.get();
			e.setSalary(emp.getSalary());
			employeeRepository.saveAndFlush(e);
			return "Employee salary updated";
		}else {
			return "Employee record not present";
		}
	}
	
	public String updateEmployeeInfo(Employee emp) {
		Optional<Employee> result	= employeeRepository.findById(emp.getId());
		if(result.isPresent()) {
			Employee e =result.get();
			e.setSalary(emp.getSalary());
			e.setName(emp.getName());
			employeeRepository.saveAndFlush(e);
			return "Employee details updated";
		}else {
			return "Employee record not present";
		}
	}
}
