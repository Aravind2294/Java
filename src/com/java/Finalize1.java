package com.java;

public class Finalize1 {
	public Finalize1() {
		System.out.println("Java");
		System.out.println("Selenium");
	}

	public Finalize1(int a) {
		System.out.println(a);
		System.out.println("Selenium");
	}

	public static void main(String[] args) throws Throwable {
		Finalize1 f = new Finalize1();
		f.finalize();
		Finalize1 f1 = new Finalize1(10);
		f1.finalize();
	}
}
