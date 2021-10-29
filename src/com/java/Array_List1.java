package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_List1 {

	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();

		l.add(56);
		l.add(59);
		l.add(58.65);
		l.add("Arav");
		l.add('A');
		System.out.println(l);

		int size = l.size(); // To calculate length or size
		System.out.println(size);

		Object object = l.get(3); // To get/print the index of the value
		System.out.println(object);

		Object set = l.set(2, 60); // To replace the value in array
		System.out.println(l);

		Object remove = l.remove(4); // To remove the value from the array index
		System.out.println(l);

		int indexOf = l.indexOf(60); // To print the index of the array
		System.out.println(indexOf);

		boolean contains = l.contains("Arav"); // To check the given value to the array
		System.out.println(contains);

//		l.clear(); // To clear the values in array
//		System.out.println(l);

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(55);
		l1.add(56);
		l1.add(59);
		System.out.println(l1);

//		l.addAll(l1); // To add the given values in existing array
//		System.out.println(l);

//		l.retainAll(l1); // Common values of the arrays can be printed 
//		System.out.println(l);

		l.removeAll(l1); // Common values of the arrays can be removed
		System.out.println(l);

		Collections.sort(l1); // To get the values in ascending order
		System.out.println(l1);

		Collections.sort(l1, Collections.reverseOrder()); // To get the values in descending order
		System.out.println(l1);

		boolean empty = l1.isEmpty(); // To check the values in array weather it is empty
		System.out.println(empty);

		boolean equals = l.equals(l1);// To check the values in array weather it is equal
		System.out.println(equals);
	}
}
