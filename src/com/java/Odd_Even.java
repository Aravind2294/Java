package com.java;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you have to check ?");
		int j = sc.nextInt();
		int x = 1;
		for (int i = 0; i < j; i++) {
			System.out.println("Enter the " + x++ + " number");
			int n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println(n + " is even number");
			} else {
				System.out.println(n + " is odd number");
			}
			System.out.println();
		}
	}
}
