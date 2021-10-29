package com.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r = 0, a = 0, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int t = n;

		while (n > 0) {
			r = n % 10;
			a = a * 10 + r;
			n = n / 10;
			System.out.println("Step " + i++);
			System.out.println("Digit: " + r);
			System.out.println("Sum = " + a);
			System.out.println();
		}
		if (t == a) {
			System.out.println(t + " is Palindrome");
		} else {
			System.out.println(t + " is not Palindrome");
		}
	}
}
