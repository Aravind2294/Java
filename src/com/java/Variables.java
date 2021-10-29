package com.java;

public class Variables {

	public static void add() {
		int a = 10;
		System.out.println(a);
	}

	static int a;
	static float b1;
	static double b = 5;

	public static void close() {
		System.out.println(a);
		System.out.println(b1);
		System.out.println(b);
		System.out.println("...The End....");
	}

	public static void main(String[] args) {
		add();
		close();

	}
}
