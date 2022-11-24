package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	System.out.println(ll);
	ll.add(2, 100);
	ll.remove(4);
		System.out.println(ll);
	ll.addFirst(100);
	ll.addLast(200);
	System.out.println(ll);
	System.out.println(ll.getFirst());
	System.out.println(ll.getLast());
	System.out.println(ll.get(0));
	}

}
