package abc;
class A {
	void dis1() {
		System.out.println("A class method");
	}
}
class B extends A{
	void dis1() {
		System.out.println("A class method - override by B");
	}
	void dis2() {
		System.out.println("B class method");
	}
}
public class DemoTest1 {
	public static void main(String[] args) {
//		A obj1 = new A();			// super class object creation 
//		obj1.dis1();
//			B obj2 = new B();			// creating sub class object 
//		obj2.dis1();
//		obj2.dis2();
//			A obj3 = new B();		// creating sub class object and super class reference possible
//				B obj4 = new A();		// creating super class object and sub class reference not possible
//		obj3.dis1();   // with this reference we can call only those method which belong to super class or overrided method. 
	
		A obj1 = new B();		// Runtime polymorphism 
		obj1.dis1();
	}
}
