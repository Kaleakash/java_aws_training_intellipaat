package mno;

abstract class A {
	abstract void dis1();
}
class B extends A{
	void dis1() {
		System.out.println("A class method - override by B");
	}
	void dis2() {
		System.out.println("B class method");
	}
}
public class DemoTest2 {
	public static void main(String[] args) {
		A obj1 = new B();		// Runtime polymorphism we are creating the reference of abstract class. 
		obj1.dis1();
	}
}

