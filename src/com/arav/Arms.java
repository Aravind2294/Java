package com.arav;

import java.util.Scanner;

public class Arms {
	public static void main(String[] args) {
		int a = 0, c = 0, j = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit");
		int n = sc.nextInt();
		System.out.println("Enter the number");
//		int result = 0;
		for (int i = 0; i < n; i++) {
			int result = 0;
			c = sc.nextInt();
			int t = c;
//			int result = 0;
			while (c > 0) {
//				int result = 0;
				a = c % 10;
				result = result + (a * a * a);
				c = c / 10;
				System.out.println("Iteration " + j++);
				System.out.println("Digit: " + a);
				System.out.println("Sum = " + result);
				System.out.println();
			}
			if (t == result) {
				System.out.println("armstrong");
			} else {
				System.out.println("non armstrong");
			}
		}
	}
}
