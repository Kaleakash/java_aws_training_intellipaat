package xyz;


interface A {
	void dis1();
}

class B implements A{
	public void dis1() {
		System.out.println("A class method - override by B");
	}
	void dis2() {
		System.out.println("B class method");
	}
}
public class DemoTest3 {
	public static void main(String[] args) {
		A obj1 = new B();		// Runtime polymorphism we are creating the reference interface.
		obj1.dis1();
	}
}
