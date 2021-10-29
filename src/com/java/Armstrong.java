package com.java;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int r = 0, a = 0, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		int t = n;

		while (n > 0) {
			r = n % 10;
			a = a + (r * r * r * r);
			n = n / 10;
			System.out.println("Iteration " + i++);
			System.out.println("Digit: " + r);
			System.out.println("Sum = " + a);
			System.out.println();
		}
		if (t == a) {
			System.out.println(t + " is Armstrong number");
		} else {
			System.out.println(t + " is non Armstrong number");
		}
	}
}
