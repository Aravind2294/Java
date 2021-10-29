package com.webtask;

public class GreensTech {

	public void greensOmr() {
		System.out.println("Branch1");
	}

	public void greensAdayar() {
		System.out.println("Branch2");

	}

	public void greensTambaram() {
		System.out.println("Branch3");

	}

	public void greensVelacherry() {
		System.out.println("Branch4");

	}

	public void greensAnnaNagar(String name) {
		System.out.println(name);

	}
	public static void main(String[] args) {
		GreensTech g = new GreensTech();
		g.greensOmr();
		g.greensAdayar();
		g.greensTambaram();
		g.greensVelacherry();
		g.greensAnnaNagar("Branch5");
	}
}
