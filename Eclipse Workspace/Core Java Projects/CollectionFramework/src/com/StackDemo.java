package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		System.out.println("empty "+ss.empty());
			ss.push(100);
			ss.push(200);
			ss.push(300);
			ss.push(400);
			System.out.println(ss);
			System.out.println("top most element "+ss.peek());
			System.out.println(ss);
			System.out.println("top most element "+ss.pop());
			System.out.println(ss);
			System.out.println("empty "+ss.empty());
			System.out.println("Search "+ss.search(300));
			System.out.println("Search "+ss.search(3000));
			System.out.println("Size "+ss.size());
	}

}
