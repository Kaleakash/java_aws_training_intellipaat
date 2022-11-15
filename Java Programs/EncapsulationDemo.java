class Employee {
	private String name;
	private float salary;
	/*void setValue(String name1, float salary1) {
			name = name1;
			//salary = salary1;
			if(salary1<0) {
				salary = 8000;
			}else {
				salary = salary1;
			}
	}*/
	void setValue(String name, float salary) {
			this.name = name;			// localVariable = localVariable 
			//this.salary = salary;
			if(salary<0) {
				this.salary = 8000;
			}else {
				this.salary = salary;
			}
	}
	void display() {
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class EncapsulationDemo {
	public static void main(String args[]) {
	//salary = 12000;
	//display();
	Employee emp1 = new Employee();
	//emp1.name="Ravi";
	//emp1.salary = -12000;
	emp1.setValue("Ravi",12000);
	emp1.display();
	}
}