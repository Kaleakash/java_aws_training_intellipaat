package com.bean;

import java.util.Objects;

public class Employee {
private int id;
private String name;
private float salary;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
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
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
//@Override
//public boolean equals(Object obj) {
//	// we can write logic 
//	Employee emp = (Employee)obj;		// down level type casting 
//	if(this.id==emp.id && this.name.equals(emp.name) && this.salary==emp.salary) {
//		return true;
//	}else {
//		return false;
//	}	
//}
//@Override
//public int hashCode() {
//	int hash = 32+id+name.hashCode()+(int)salary;
//	return hash;
//}
@Override
public int hashCode() {
	return Objects.hash(id, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)			// emp1.equals(emp1)
		return true;
	if (obj == null)			// emp1.equals(null)
		return false;
	if (getClass() != obj.getClass())	// emp.equals(mgr1)
		return false;
	Employee other = (Employee) obj;
	return id == other.id && Objects.equals(name, other.name)
			&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
}


//public String toString() {
//	return "This is employee class object";
//}



}
