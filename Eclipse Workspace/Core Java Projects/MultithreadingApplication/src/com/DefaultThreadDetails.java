package com;

public class DefaultThreadDetails {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		String name = t.getName();
		int i = t.getPriority();
		ThreadGroup tg= t.getThreadGroup();
		System.out.println(name);
		System.out.println(i);
		System.out.println(tg.getName());
		t.setPriority(3);
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);
		t.setName("My Thread");
		System.out.println(t);
	}
}
