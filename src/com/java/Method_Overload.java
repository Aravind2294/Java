package com.java;

public class Method_Overload {

	public void load() {
		System.out.println("Type");
	}

	public void load(int a) {
		System.out.println(a);
	}

	public void load(String name) {
		System.out.println(name);
	}

	public void load(int b, int c) {
		System.out.println(b+c);
	}

//	public static void main(String[] args) {
//		Method_Overload m = new Method_Overload();
//		m.load();
//		m.load(10);
//		m.load("Data");
//		m.load(50, 50);
//	}

}
