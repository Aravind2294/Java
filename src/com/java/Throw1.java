package com.java;

public class Throw1 {

	public static void vote(int age) throws Exception {
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			throw new Exception("You are not eligible to vote");
			// System.out.println("You are not eligible to vote");
		}
	}

	public static void main(String[] args) throws Throwable {
		vote(17);
	}
}
