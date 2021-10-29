package com.java;

public class Abscall extends Abstraction {

	@Override
	public void cash() {
		System.out.println("50000");
	}

	@Override
	public void GPay() {
		super.GPay();
	}

	@Override
	public void Paytm() {
		super.Paytm();
	}

	public static void main(String[] args) {
		Abscall a = new Abscall();
		a.cash();
		a.GPay();
		a.Paytm();
	}
}