package com;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
	Queue q1 = new PriorityQueue();
	Queue q2 = new LinkedList();
	Deque q3 = new LinkedList();
	
	q1.add(2);
	q1.add(5);
	q1.add(1);
	q1.add(6);
	q1.add(2);
	q1.add(8);
	
	q2.add(2);
	q2.add(5);
	q2.add(1);
	q2.add(6);
	q2.add(2);
	q2.add(8);
	
	System.out.println(q1);
	System.out.println(q2);
	System.out.println(q1.poll());
	System.out.println(q2.poll());
	System.out.println(q1);
	System.out.println(q2);
	q3.add(10);
	q3.addFirst(100);
	q3.addLast(200);
	
	System.out.println(q3);
	}

}
