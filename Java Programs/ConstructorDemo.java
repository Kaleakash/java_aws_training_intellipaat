class Abc {
	Abc() {
		System.out.println("object created...empty");
	}
	Abc(int x) {
		System.out.println("object created..."+x);
	}
	void display() {
		System.out.println("Abc class method");
	}
}
class Calculator {
	int a,b,sum;
	Calculator() {
		a=10;
		b=20;
	}
	Calculator(int x, int y) {
		a=x;
		b=y;
	}
	void setValue(int x, int y) {
		a=x;
		b=y;
	}
	void add() {
		sum = a+b;
	}	
	void display() {
		System.out.println("Sum of two number is "+sum);
	}
}
class ConstructorDemo {
	public static void main(String args[]) {
	/*Abc obj1 = new Abc(11);
	Abc obj2 = new Abc(10);
	obj1.display();
	obj2.display();*/
	Calculator c1 = new Calculator();										c1.display();
	Calculator c2 = new Calculator();						c2.add();		c2.display();
	Calculator c3 = new Calculator(100,200);				c3.add();		c3.display();
	Calculator c4 = new Calculator();		c4.setValue(1,2);	c4.setValue(11,22);		c4.setValue(111,222);	c4.add();		c4.display();
	}
}












