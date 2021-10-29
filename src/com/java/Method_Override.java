package com.java;

public class Method_Override extends Method_Overload {

	@Override
	public void load() {
		super.load();
	}

	@Override
	public void load(int a) {
		super.load(a);
	}

	@Override
	public void load(int b, int c) {
		super.load(b, c);
	}

	@Override
	public void load(String name) {
		super.load(name);
	}

	public static void main(String[] args) {
		Method_Override m = new Method_Override();
		m.load();
		m.load(10);
		m.load(20, 30);
		m.load("Aravind");
	}
}