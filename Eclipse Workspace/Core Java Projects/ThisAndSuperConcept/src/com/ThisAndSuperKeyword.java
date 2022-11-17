package com;
class A {
	int x=100;
}
class B extends A {
	int x=200;
	void dis() {
		int x = 300;
		System.out.println("x "+x);
		System.out.println(" instance variable "+this.x);
		System.out.println("super class variable "+super.x);
	}
}
public class ThisAndSuperKeyword {
	public static void main(String[] args) {
		B obj = new B();
		obj.dis();
	}

}
