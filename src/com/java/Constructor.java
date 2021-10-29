package com.java;

public class Constructor {

	public Constructor() {
		System.out.println("Male");
	}

	public Constructor(int a, int b) {
		System.out.println(b + a);
		System.out.println(a - b);
	}

	public Constructor(String name) {
		System.out.println("S." + name);
	}

	public static void main(String[] args) {
		Constructor C = new Constructor();
		Constructor C1 = new Constructor(10, 20);
		Constructor C2 = new Constructor("Aravind");

	}

}
