package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component					//<bean class="com.Employee" id="emp"></bean>
@Scope("prototype")
public class Employee {		// by default id name is class name camel naming rule 
@Value(value = "100")
private int id;				// ie employee if class name is EmployeeDetails then 
@Value(value="Ravi")
private String name;		// id is employeeDetails
@Value(value="24000")
private float salary;
@Autowired							
private Address add;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
}

}
