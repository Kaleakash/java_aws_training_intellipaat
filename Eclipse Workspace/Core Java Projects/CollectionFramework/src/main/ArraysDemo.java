package main;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	int abc[]= {3,1,5,8,4,9,2,6,7};
	System.out.println("All elements before sort");
	for(int n:abc) {
		System.out.print(n+" ");
	}
	System.out.println();
		Arrays.sort(abc);
	System.out.println("After elements after sort");
	for(int n:abc) {
		System.out.print(n+" ");
	}
	System.out.println();
//	System.out.println("Search "+Arrays.binarySearch(abc, 5));
//	System.out.println("Search "+Arrays.binarySearch(abc, 2));
//	System.out.println("Search "+Arrays.binarySearch(abc, 10));
	if(Arrays.binarySearch(abc, 7)<0) {
		System.out.println("Element not present");
	}else {
		System.out.println("Element present");
	}
	}

}
