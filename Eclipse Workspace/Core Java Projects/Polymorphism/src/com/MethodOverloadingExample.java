package com;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		Operation op = new Operation();
		op.add(10,20,30);
		op.add(10.10f, 20.20f);
		op.add("10", "20");
		op.add(10, 20);
	}

}
