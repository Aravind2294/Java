package com.java;

public class Mutable {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("AR"); // create new memory
		StringBuffer s1 = new StringBuffer("'WIND'"); // create new memory

		System.out.println(System.identityHashCode(s)); // print the memory ID
		System.out.println(System.identityHashCode(s1));

		s1.append(s); // to append the same memory what we given

		System.out.println(s);
		System.out.println(System.identityHashCode(s1));
	}
}
