package com.forloop;

import java.util.Scanner;

public class Fibonacci_While_Loop {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println("Enter the number to sequence:");

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Fibonacci series is:" + num);

		int i = 1;
		while (i <= num) {
			System.out.println(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			++i;
		}
	}
}