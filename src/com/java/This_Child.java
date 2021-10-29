package com.java;

public class This_Child extends Super_Parent {

	int a = 2001;

	public void add() {
		//System.out.println(super.a);
		System.out.println(this.a);
	}

	public void value1() {
		super.emp();
		this.add();
	}

	public static void main(String[] args) {
		This_Child t = new This_Child();
		t.value1();
	}
}
