package com.java;

public class Imutable {
	public static void main(String[] args) {

		String s = "Aravind"; // Allocated memory
		String s1 = "Aravind";// Duplicate // Share the memory

		System.out.println(System.identityHashCode(s)); // print the memory ID
		System.out.println(System.identityHashCode(s1));

		s = s + s1; // to concat and create new memory

		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
}
