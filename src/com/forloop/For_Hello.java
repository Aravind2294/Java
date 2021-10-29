package com.forloop;

public class For_Hello {

	public static void main(String[] args) {
		for (int x = 10; x >= 5; x--) {                   // To print 5 times with decrement
			System.out.println("Hello World" + x);
		}

		for (int x = 0; x < 5; x++) {                    // To print 5 times with increment
			System.out.println("Hello World" + x);
		}
	}
}