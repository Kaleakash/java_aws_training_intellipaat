package bean;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable,Comparable<Employee>{
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
@Override
	public int compareTo(Employee o) {
		// it check current object property and another object property 
		//if both are equal retun 0 if first is > second return +ve 
		//else return -ve 
		//return this.id-o.id;		// sort by id asc 
		//return o.id-this.id;	// sor by id desc 
		//return (int)(this.salary-o.salary);	// sort by salary asc
		//return (int)(o.salary-this.salary);	// sort by salary asc
	
		//return	this.name.compareTo(o.name);		// name by asc
		return	o.name.compareTo(this.name);		// name by desc
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

@Override
public int hashCode() {
	return Objects.hash(id, name, salary);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return id == other.id && Objects.equals(name, other.name)
			&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
}




}
