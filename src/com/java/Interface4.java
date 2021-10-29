package com.java;

public class Interface4 implements Interface3, Interface2, Interface1 {

	@Override
	public void phonepe() {
		System.out.println("10000");
	}

	@Override
	public void gpay() {
		System.out.println("20000");
	}

	@Override
	public void netbanking() {
		System.out.println("30000");
	}

	@Override
	public void paytm() {
		System.out.println("40000");
	}
	public static void main(String[] args) {
		Interface4 i = new Interface4();
		i.phonepe();
		i.gpay();
		i.netbanking();
		i.paytm();
	}
}